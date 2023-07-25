package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test09 {

	public static void main(String[] args) {
		// 도서명, 저자, 출판사를 수정하는 프로그램을 구현
		// 메소드 이름은 updateBookInfo
		
		BookDto dto = new BookDto();
		dto.setBookId(1);
		dto.setBookTitle("abc");
		dto.setBookAuthor("mary");
		dto.setBookPublisher("abcChoco");
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookInfo(dto);
		
		if (result) {
			System.out.println("도서 정보가 수정이 완료되었습니다.");
		} else {
			System.out.println("등록되지 않은 도서입니다.");
		}
		
	}

}
