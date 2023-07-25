package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {

	public static void main(String[] args) {
		//게시글 수정 프로그램
		// 게시글을 수정하는 프로그램을 구현 제목과 내용 항목을 수정
		BoardDto dto = new BoardDto();
		dto.setBoardNo(1);
		dto.setBoardTitle("제목수정");
		dto.setBoardContent("내용수정");
		
		//DB처리
		BoardDao dao = new BoardDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("게시글 수정 완료");
		} else {
			System.out.println("게시글을 찾을 수 없습니다.");
		}
 
	}

}
