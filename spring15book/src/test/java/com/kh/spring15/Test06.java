package com.kh.spring15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06 {
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		//(주의) 구문을 부를 때는 값을 1개만 전달할 수 있다.
		    //그래서 클래스를 만들어 처리하거나 Map으로 처리를 한다.
		//String type = "book_title", keyword = "바꾼";
		//List<BookDto> list = sqlSession.selectList("book.search", type, keyword);
		
		//값이 여러 개라면 객체 또는 Map을 사용하여 묶어서 전달
		Map<String, Object> param = new HashMap<>(); //임시객체의 역할인 Map을 만듬
		param.put("type", "book_title"); //이름과 값
		param.put("keyword", "바꾼");
		List<BookDto> list = sqlSession.selectList("book.search", param);
		
		for(BookDto dto : list) {
			log.debug("dto = {}", dto);
		}
		
	}
}
