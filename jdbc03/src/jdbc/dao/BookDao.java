package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
import jdbc.util.JdbcUtils;

public class BookDao {
	//조회
	public void insert(BookDto dto) {
		String sql = "insert into book("
				+ "book_id, book_title, book_author, book_publication_date, "
				+ "book_price, book_publisher, book_page_count, "
				+ "book_genre) values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		Object[] data = {dto.getBookTitle(), dto.getBookAuthor(),
				dto.getBookPublicationDate(), dto.getBookPrice(), 
				dto.getBookPublisher(), dto.getBookPageCount(), 
				dto.getBookGenre()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql,data);
 
	}
	
	//수정(도서가격)
	public boolean updateBookPrice(BookDto dto) {
		String sql = "update book set book_price=? where book_id =?";
		Object[] data = {dto.getBookPrice(), dto.getBookId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0; //위 코드를 한 줄로 줄인 것 
	}
	
	//수정(도서명, 저자, 출판사)
	public boolean updateBookInfo(BookDto dto) {
		String sql = "update book set book_title=?, book_author=?, book_publisher=? where book_id=?";
		Object[] data = {dto.getBookTitle(), dto.getBookAuthor(), dto.getBookPublisher(),
				dto.getBookId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
}
