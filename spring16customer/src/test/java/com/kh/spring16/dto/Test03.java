package com.kh.spring16.dto;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test03 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int customerNo = 2;
		CustomerDto customerDto = sqlSession.selectOne("customer.find", customerNo);
		log.debug("dto = {}", customerDto);
	}

}
