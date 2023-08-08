package com.kh.spring10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring10.dao.ShirtDao;

//스프링은 1원칙이 등록 2원칙이 주세요

@SpringBootTest
public class ShirtDeleteTest {
	
	@Autowired
	private ShirtDao dao;
	
	@Test
	public void test() {
		int shirtNo = 999;
		boolean result = dao.delete(shirtNo);
		System.out.println("result = " + result);
	}
}
