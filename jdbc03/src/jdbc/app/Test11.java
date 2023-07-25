package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11 {
	public static void main(String[] args) {
		
		//회원정보 수정
		
		String memberId = "testuser1";
//		String memberPw = "";
//		String memberPwRe = "";
		String memberNickname = "테스트변경1";
		String memberBirth = "2000-09-09";
		String memberEmail = "change@testuser.com";
		String memberContact = "01099999999";
		
//		비밀번호 DB 검사 및 비밀번호 일치 검사 등을 추가할 수 있다
		
		MemberDto dto = new MemberDto();
		dto.setMemberId(memberId);
		dto.setMemberNinkname(memberNickname);
		dto.setMemberBirth(memberBirth);
		dto.setMemberEmail(memberEmail);
		dto.setMemberContact(memberContact);
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberInfo(dto);
		
		if(result) {
			System.out.println("정보 변경이 완료되었습니다");
		}
		else {
			System.out.println("존재하지 않는 회원입니다");
		}
	}
}

