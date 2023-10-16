package com.kh.spring17;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.MemberDto;
import com.kh.spring17.vo.MemberComplexSearchVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberComplexSearchTest {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		MemberComplexSearchVO vo = new MemberComplexSearchVO();
//		vo.setMemberId("testuser");
//		vo.setMemberNickname("테스트유저");
//		vo.setMemberEmail("@kh.com");
		
//		vo.setMemberBirth("2022-01-01");
//		vo.setMemberContact("01012345678");
		
//		vo.setMemberLevelList(List.of("일반", "VIP", "관리자"));
		
//		vo.setMemberPointMin(500);
//		vo.setMemberPointMax(600);
		
//		vo.setMemberJoinBegin("2020-01-01");
//		vo.setMemberJoinEnd("2023-12-31");
		
//		vo.setMemberLoginBegin("2023-01-01");
//		vo.setMemberLoginEnd("2023-10-16");
		
		vo.setOrderList(List.of("member_id asc"));
		
		List<MemberDto> list = sqlSession.selectList("member.complexSearch", vo);
		log.debug("조회 결과 수 = {}", list.size());
		for(MemberDto dto : list) {
			log.debug("dto = {}", dto);
		}
	}
}
