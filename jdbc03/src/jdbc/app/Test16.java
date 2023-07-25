package jdbc.app;

import java.util.List;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test16 {

	public static void main(String[] args) {
		// 게시글 목록 출력 프로그램
		//데이터 없음
		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.selectList();
		
		for(BoardDto dto : list) {
			System.out.print("[" + dto.getBoardNo() + "] ");
			System.out.println(dto.getBoardTitle());
		}
	}

}
