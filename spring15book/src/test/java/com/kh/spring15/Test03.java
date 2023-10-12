package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

@SpringBootTest
public class Test03 {
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		BookDto bookDto = new BookDto(); //객체 생성 후
		
		//전달
//		bookDto.setBookTitle("재밌는책");
//		bookDto.setBookAuthor("재밌는작가");
//		bookDto.setBookPublicationDate("2023-10-12");
//		bookDto.setBookPrice(50000);
//		bookDto.setBookPublisher("재밌는출판사");
//		bookDto.setBookPageCount(500);
//		bookDto.setBookGenre("코믹");
//		sqlSession.insert("book.add",bookDto);
		
		//전달2
//		BookDto dto = BookDto.builder().bookTitle("테스트서적").build();
		
		sqlSession.insert("book.add", BookDto.builder()
				.bookTitle("테스트서적")
				.bookAuthor("테스트저자")
				.bookPublicationDate("2023-10-12")
				.bookPrice(99.99f)
				.bookPublisher("테스트출판사")
				.bookPageCount(99)
				.bookGenre("교양")
				.build());

	}

}
