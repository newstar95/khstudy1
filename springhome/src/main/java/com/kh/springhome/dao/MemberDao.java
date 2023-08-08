package com.kh.springhome.dao;

import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.MemberDto;

//메소드 명세만 작성(책으로 치면 목차)
//인터페이스는 등록x , @Repository를 쓰면 오류가 난다. 인터페이스는 객체 생성이 안 되기 때문에
public interface MemberDao {
	void insert(MemberDto memberDto);
	MemberDto selectOne(String memberId);

}
