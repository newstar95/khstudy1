package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test02 {
	@Autowired 
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int bookId = 4;
		BookDto bookDto = sqlSession.selectOne("book.find", bookId);
		log.debug("dto = {}", bookDto);
	}
}
