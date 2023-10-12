package com.kh.spring16.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		Map<String, Object> param = new HashMap<>();
		param.put("type", "customer_id");
		param.put("keyword", "testt");
		List<CustomerDto> list = sqlSession.selectList("customer.search", param);
		
		for(CustomerDto dto : list) {
			log.debug("dto = {}", dto);
		}
	}

}
