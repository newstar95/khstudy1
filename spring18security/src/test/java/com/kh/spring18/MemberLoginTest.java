package com.kh.spring18;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.dao.SecureMemberDao;
import com.kh.spring18.dto.SecureMemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberLoginTest {

	@Autowired
	private SecureMemberDao dao;
	
	@Test
	public void test() {
		//로그인 테스트
		SecureMemberDto dto = SecureMemberDto.builder().memberId("hello1234")
																						.memberPw("password1234").build();
		SecureMemberDto target = dao.login(dto); 
		log.debug("target = {}", target);
		
		assertNotNull(target); //target이 not null이면 테스트 성공
//		Assertions	.assertNotNull(target); //원래 이 방식인데 위처럼 메소드를 import 하는 것이다.
		//test라는 특수환경에서는 계속해서 클래스를 적고 부르기가 힘드니까... (test에서만 가능 main에서는 아예 안 뜸)
	}
}
