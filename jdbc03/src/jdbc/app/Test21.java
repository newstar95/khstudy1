package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test21 {

	public static void main(String[] args) {
		// Board 테이블 - 기본키를 이용한 상세조회 구현
		int boardNo = 1;
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.selectOne(boardNo);
		
		if(dto == null) {
			System.out.println("찾으시는 게시글이 존재하지 않습니다.");
		} else {
			System.out.println("[" + dto.getBoardWriter() + "] " + dto.getBoardTitle());
		}

	}

}
