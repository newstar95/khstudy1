package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test22 {

	public static void main(String[] args) {
		// Menber 테이블 - 기본키를 이용한 상세조회 구현
		String memberId = "testuser1";
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		if (dto == null) {
			System.out.println("찾으시는 회원이 존재하지 않습니다.");
		} else {
			System.out.println(dto.getMemberId() + " 님의 정보");
			System.out.println("닉네임: " + dto.getMemberNinkname());
			System.out.println("이메일: " + dto.getMemberEmail());
			System.out.println("전화번호: " + dto.getMemberContact());
			System.out.println("생년월일: " + dto.getMemberBirth());
			System.out.println("레벨: " + dto.getMemberLevel());
			System.out.println("포인트: " + dto.getMemberPoint() + " point");
		}
		

	}

}
