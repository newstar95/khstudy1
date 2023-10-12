package com.kh.spring16.dto;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test01 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		sqlSession.insert("customer.add", CustomerDto.builder()
				.customerId("testtuser1")
				.customerContact("010-1111-1234")
				.customerJoin("2023-10-12")
				.customerPurchase("2023-10-12")
				.customerMileage(100)
				.customerLevel("일반")
				.build()
				);
	}

}
