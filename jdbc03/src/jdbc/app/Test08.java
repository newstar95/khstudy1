package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test08 {

	public static void main(String[] args) {
		// 도서가격을 수정하는 프로그램을 구현
		// 메소드 이름은 updateBookPrice
		BookDto dto = new BookDto();
		dto.setBookId(1);
		dto.setBookPrice(20.20f);
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookPrice(dto);
		
		if (result) {
			System.out.println("도서 가격이 수정 완료되었습니다.");
		} else {
			System.out.println("등록되지 않은 도서입니다.");
		}
		
	}

}
