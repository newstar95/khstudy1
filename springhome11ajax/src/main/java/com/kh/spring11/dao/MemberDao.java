package com.kh.spring11.dao;

import com.kh.spring11.dto.MemberDto;
//메소드 명세만 작성(책으로 치면 목차)
//인터페이스는 등록x , @Repository를 쓰면 오류가 난다. 인터페이스는 객체 생성이 안 되기 때문에
public interface MemberDao {
	void insert(MemberDto memberDto);
	MemberDto selectOne(String memberId);
	boolean updateMemberLogin(String memberId);
	boolean updateMemberPw(String memberId, String changePw);
	boolean updateMemberInfo(MemberDto memberDto);
	boolean updateMemberInfoByAdmin(MemberDto memberDto);
	boolean delete(String memberId);
	
//	boolean updateMemberPoint(String memberId); //어떠한 경우에도 부르면 n점 (ex 조회수)
	boolean increaseMemberPoint(String memberId, int point); 
//	boolean decreaseMemberPoint(String memberId, int point); 
	
	//차단 + 해제 기능
	void insertBlock(String memberId);
	boolean deleteBlock(String memberId);
	
	MemberDto selectOneByMemberNickname(String memberNickname);
}
