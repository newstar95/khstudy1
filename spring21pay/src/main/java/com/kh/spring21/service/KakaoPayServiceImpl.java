package com.kh.spring21.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kh.spring21.configuration.KakaoPayProperties;
import com.kh.spring21.dao.ProductDao;
import com.kh.spring21.dto.ProductDto;
import com.kh.spring21.vo.KakaoPayApproveRequestVO;
import com.kh.spring21.vo.KakaoPayApproveResponseVO;
import com.kh.spring21.vo.KakaoPayCancelRequestVO;
import com.kh.spring21.vo.KakaoPayCancelResponseVO;
import com.kh.spring21.vo.KakaoPayDetailRequestVO;
import com.kh.spring21.vo.KakaoPayDetailResponseVO;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;
import com.kh.spring21.vo.PurchaseListVO;
import com.kh.spring21.vo.PurchaseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KakaoPayServiceImpl implements KakaoPayService {
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private HttpHeaders headers;
	
	@Autowired
	private ProductDao productDao;

	@Override
	public KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO request) throws URISyntaxException {
		// 주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready"); 
		
		// 바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid()); //개발자용 가맹점 코드
		body.add("partner_order_id", request.getPartnerOrderId()); //가맹점 주문번호
		body.add("partner_user_id", request.getPartnerUserId()); //가맹점 회원아이디
		body.add("item_name", request.getItemName()); //상품명(전체 주문 수 - 1)
		body.add("quantity", "1"); //상품수량(무조건 1이라 쓰고 실제 구매수량은 DB에서 관리
		body.add("total_amount", String.valueOf(request.getItemPrice())); //판매금액
		body.add("tax_free_amount", "0"); //상품 비과세 금액
		
		//현재 페이지 주소 계산
		String path = ServletUriComponentsBuilder
									.fromCurrentRequestUri().toUriString(); 
		body.add("approval_url", path+"/success"); //부가세
		body.add("cancel_url", path+"/cancel");
		body.add("fail_url", path+"/fail");
		
		// 요청 발송
				HttpEntity entity = new HttpEntity(body, headers);
				
				KakaoPayReadyResponseVO response = 
						template.postForObject(uri, entity, KakaoPayReadyResponseVO.class);
				
				return response;
	}

	@Override
	public KakaoPayApproveResponseVO approve(KakaoPayApproveRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		//body 부분 (5개 중 4개는 request에 들어있다)
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid",request.getTid()); //거래번호
		body.add("partner_order_id", request.getPartnerOrderId()); 
		body.add("partner_user_id", request.getPartnerUserId());
		body.add("pg_token", request.getPgToken());
		
		HttpEntity entity = new HttpEntity(body,headers);
		
		KakaoPayApproveResponseVO response = 
				template.postForObject(uri, entity, KakaoPayApproveResponseVO.class);
		
		log.debug("결제 승인 완료 = {}", response.getTid());
		return response;
	}

	@Override
	public KakaoPayDetailResponseVO detail(KakaoPayDetailRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/order");
			
			MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
			body.add("cid", kakaoPayProperties.getCid());
			body.add("tid", request.getTid());
			
			HttpEntity entity = new HttpEntity(body, headers);
			
			KakaoPayDetailResponseVO response = template.postForObject(uri, entity, KakaoPayDetailResponseVO.class);
			return response;
	}

	@Override
	public KakaoPayCancelResponseVO cancel(KakaoPayCancelRequestVO request) throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/cancel");
		
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoPayProperties.getCid());
		body.add("tid", request.getTid());
		body.add("cancel_amount", String.valueOf(request.getCancelAmount()));
		body.add("cancel_tax_free_amount", "0");
		
		HttpEntity entity = new HttpEntity(body, headers);
		
		KakaoPayCancelResponseVO response =
				template.postForObject(uri, entity, KakaoPayCancelResponseVO.class);
		return response;
		
	}

	@Override
	public KakaoPayReadyRequestVO convert(PurchaseListVO listVO) {
		// 구매목록 추출
		List<PurchaseVO> list = listVO.getProduct();
		
		String name = null;
		int total = 0;
		
		//구매목록을 모두 조사하여 상품정보 추출 후 필요한 항목을 계산
		for(PurchaseVO vo : list) {
			//vo 안에는 상품번호(productNo)와 구매수랑(qty)가 있다.
			ProductDto dto = productDao.selectOne(vo.getProductNo());
			if(name == null) { //이름이 없을 때만 이름을 넣어라(최초 이름만 들어감)
				name = dto.getProductName(); 
			}
			total += dto.getProductPrice() * vo.getQty(); //상품 가격과 수량을 곱해서 합산해라!
		}
		
		//구매 수량이 2개 이상이라면 이름에 "외 ?건"를 추가
		if(list.size() >= 2) {
			name += " 외 "+ (list.size()-1)+"건";
		}
		
		return KakaoPayReadyRequestVO.builder()
				
				.partnerOrderId(UUID.randomUUID().toString())
				.itemName(name)
				.itemPrice(total)
				.build();
	}

}
