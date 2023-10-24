package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test02Ready {
	
	@Test
	public void test() throws URISyntaxException {
		//변하는 정보와 중요한 정보들을 분리하여 모듈로 개발
		
		//결제시마다 변하는 정보 - 상품명, 상품가격, 주문번호, 구매자ID
		String partnerOrderId = UUID.randomUUID().toString();
		String partnerUserId = "testuser1";
		String itemName = "슈퍼 울트라 노트북";
		int itemPrice = 999990;
		
		// 전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		// 주소 설정
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready"); //페이지만 url이라 부르고 페이지를 포함한 여러가지 리소스 즉 넓은 의미로 쓰이는 것이 uri
		
		// 헤더 설정
		HttpHeaders headers = new HttpHeaders(); //springframework를 import 해야함
		headers.add("Authorization", "KakaoAK 2446b338e7c4dd116a93cbb08cd51d79");
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		// 바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME"); //개발자용 가맹점 코드
		body.add("partner_order_id", partnerOrderId); //가맹점 주문번호
		body.add("partner_user_id", partnerUserId); //가맹점 회원아이디
		body.add("item_name", itemName); //상품명(전체 주문 수 - 1)
		body.add("quantity", "1"); //상품수량(무조건 1이라 쓰고 실제 구매수량은 DB에서 관리
		body.add("total_amount", String.valueOf(itemPrice)); //판매금액
		body.add("tax_free_amount", "0"); //상품 비과세 금액
		body.add("approval_url", "http://localhost:8080/pay/success"); //부가세
		body.add("cancel_url", "http://localhost:8080/pay/cancel");
		body.add("fail_url", "http://localhost:8080/pay/fail");
		
		// 요청 발송
		//HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers); //원형
		HttpEntity entity = new HttpEntity(body, headers);
		
		Map response = template.postForObject(uri, entity, Map.class);
		//log.debug("response = {}", response);
		log.debug("url = {}", response.get("next_redirect_pc_url"));
	}

}
