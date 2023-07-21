package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//신규 도서 등록 프로그램(ex: 도서관, 책방, ...)
		
		//데이터 - book id는 준비하지 않는다(시퀀스 활용)
		System.out.print("책 제목: ");
		String bookTitle = sc.next();
		System.out.print("책 저자: ");
		String bookAuthor = sc.next();
		System.out.print("출판일: ");
		String bookPublicationDate = sc.next();
		System.out.print("책 판매가: ");
		double bookPrice = sc.nextDouble();
		System.out.print("책 출판사: ");
		String bookPublisher = sc.next();
		System.out.print("책 페이지 수: ");
		int bookPageCount = sc.nextInt();
		System.out.print("책 장르: ");
		String bookGenre = sc.next();
		sc.close();
		
		String sql = 
				"insert into book(book_id, book_title, book_author, book_publication_date, book_price,"
				+ "book_publisher, book_page_count, book_genre) values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		Object[] data = {bookTitle, bookAuthor, bookPublicationDate, bookPrice, bookPublisher,
				bookPageCount, bookGenre};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		jdbcTemple.update(sql,data);
		System.out.println("책 정보가 저장되었습니다.");

	}

}
