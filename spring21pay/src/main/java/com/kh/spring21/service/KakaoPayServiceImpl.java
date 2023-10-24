package com.kh.spring21.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kh.spring21.configuration.KakaoPayProperties;
import com.kh.spring21.vo.KakaoPayApproveRequestVO;
import com.kh.spring21.vo.KakaoPayApproveResponseVO;
import com.kh.spring21.vo.KakaoPayReadyRequestVO;
import com.kh.spring21.vo.KakaoPayReadyResponseVO;

@Service
public class KakaoPayServiceImpl implements KakaoPayService {
	
	@Autowired
	private KakaoPayProperties kakaoPayProperties;
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private HttpHeaders headers;

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
		// TODO Auto-generated method stub
		return null;
	}

}
