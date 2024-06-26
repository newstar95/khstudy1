package com.kh.spring18.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.kh.spring18.dto.SecureMemberDto;

@Repository
public class SecureMemberDaoImpl implements SecureMemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	//회원가입
	@Override
	public void insert(SecureMemberDto dto) {
		//dto에는 사용자가 입력한 아이디와 비밀번호가 들어있을 확률이 매우 높다. (암호화 안 되어있음)
		//dto에 들어있는 비밀번호를 암호화 처리한 뒤 등록
		String origin = dto.getMemberPw();
		String encrypt =encoder.encode(origin); //변환처리
		dto.setMemberPw(encrypt);
		
		sqlSession.insert("secureMember.join", dto);
	}

	//단일조회
	@Override
	public SecureMemberDto selectOne(String memberId) {
		SecureMemberDto dto = sqlSession.selectOne("secureMember.find",memberId);
		return dto;
	}

	@Override
	public SecureMemberDto login(SecureMemberDto dto) {
		SecureMemberDto target = sqlSession.selectOne("secureMember.find", dto.getMemberId());
		if(target != null) { //아이디가 있으면
			boolean result = encoder.matches(dto.getMemberPw(), target.getMemberPw()); //일치하는 비밀번호인지 판정
			if (result == true) { //비밀번호가 암호화 도구에 의해 맞다고 판정된다면
				return target;
			}
		}
		return null;
	}
}
