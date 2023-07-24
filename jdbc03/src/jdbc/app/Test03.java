package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test03 {

	public static void main(String[] args) {
		//도서 등록 프로그램
		//데이터 - DTO
		BookDto dto = new BookDto();
		
		dto.setBookTitle("Harry Potter 1");
		dto.setBookAuthor("J.K. Rowling");
		dto.setBookPublicationDate("2001-06-26");
		dto.setBookPrice((float) 19.99);
		dto.setBookPublisher("Scholastic");
		dto.setBookPageCount(320);
		dto.setBookGenre("Fantasy");
		
		//DB처리
		BookDao dao = new BookDao();
		dao.insert(dto);
		
		System.out.println("등록 완료");
	}

}
