package com.kh.spring16.dto;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int count = sqlSession.update("customer.edit", CustomerDto.builder()
				.customerId("testuser2")
				.customerContact("010-1234-5678")
				.customerJoin("2023-10-13")
				.customerPurchase("2022-10-12")
				.customerMileage(200)
				.customerLevel("플래티넘")
				.customerNo(2)
				.build()
				);
		log.debug("count = {}", count);
	}
}
