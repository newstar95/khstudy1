package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//도서 정보 수정 프로그램
		//데이터
		int no = 41;
		System.out.print("수정할 책 제목 입력: ");
		String title = sc.nextLine();
		System.out.print("수정할 책 가격 입력: ");
		double price = sc.nextDouble();
		
		//DB처리 "update book set 변경내용 where 조건"; 
		//자바는 자동 commit 모드를 사용한다.
		String sql = "update book set BOOK_TITLE=?, BOOK_PRICE=? where BOOK_ID=?";
		Object[] data = {title, price, no};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");

		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		jdbcTemple.update(sql, data);
		
		int result = jdbcTemple.update(sql,data);
		
		if(result > 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

}
