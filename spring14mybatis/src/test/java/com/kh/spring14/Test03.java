package com.kh.spring14;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dto.PocketmonDto;

@SpringBootTest
public class Test03 {
	
	@Autowired SqlSession sqlSession;
	
	@Test
	public void test() {
		// 주의 - mybatis 구문을 호출할 때는 구문 옆에 단 한 개의 데이터만 전달할 수 있다.
		// 그러므로 객체로 만들어서 전달해야 한다.
		PocketmonDto dto = new PocketmonDto();
		dto.setName("테스트");
		dto.setType("테스트");
		sqlSession.insert("pocketmon.add", dto);
	}

}
