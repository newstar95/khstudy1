package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test18 {
	public static void main(String[] args) {
		//회원 전체 목록
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.selectList();
		
		for(MemberDto dto : list) {
			System.out.println(dto.getMemberId());
		}

	}

}
