package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10 {

	public static void main(String[] args) {
		// 비밀번호 변경 프로그램
		
		//사용자에게 필요한 정보를 입력 받아서 비밀번호를 변경하는 프로그램을 구현
		//메소드 이름은 updateMemberPassword로 구현
		
		//데이터 준비
		String memberId = "";
		String memberPw = "";
		String memberPwRe = "";
		
		//검사
		if(memberPw.equals(memberPwRe)) { //비밀번호와 확인이 일치한다면
			MemberDto dto = new MemberDto();
			dto.setMemberId("testuser1");
			dto.setMemberPw("Testuser1!!");
			
			MemberDao dao = new MemberDao();
			boolean result = dao.updateMemberPassword(dto);
			
				if (result) {
					System.out.println("패스워드 변경이 완료되었습니다.");
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			} else {
			System.out.println("비밀번호가 확인과 일치하지 않습니다.");
		}
	}
}
