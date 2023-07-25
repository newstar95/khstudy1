package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test20 {

	public static void main(String[] args) {
		// Book 테이블 - 기본키를 이용한 상세조회 구현
		int bookId = 41;
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(bookId);
		
		if(dto == null) {
			System.out.println("찾으시는 책이 없습니다.");
		} else {
			System.out.println("제목:" + dto.getBookTitle());
			System.out.println("작가: " + dto.getBookAuthor());
			System.out.println("장르: " + dto.getBookGenre());
			System.out.println("출판사: " + dto.getBookPublisher()); 
			System.out.println("가격: " + dto.getBookPrice() + "딸라."); 
		}
	}
}
