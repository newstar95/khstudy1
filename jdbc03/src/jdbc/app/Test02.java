package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test02 {

	public static void main(String[] args) {
		//게시글 작성 프로그램
		
		//데이터
		String boardTitle = "제목";
		String boardContent = "내용";
		String boardWriter = "testwriter1";
		
		//처리
		BoardDao dao = new BoardDao();
		dao.insert(boardTitle, boardContent, boardWriter);

		System.out.println("등록 완료!");
		
		BoardDto dto = new BoardDto();
		dto.setBoardTitle("제모옥");
		dto.setBoardContent("내요옹");
		dto.setBoardWriter("글쓴이잉");
	}

}
