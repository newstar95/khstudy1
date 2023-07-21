package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("글 번호:");
		int boardNo = sc.nextInt();
		System.out.print("글 제목:");
		String boardTitle = sc.next();
		System.out.print("글 내용:");
		String boardContent = sc.next();
		System.out.print("글쓴이:");
		String boardWriter = sc.next();
		
		String sql = "insert into board (board_no, BOARD_TITLE, BOARD_CONTENT, BOARD_WRITER, BOARD_READCOUNT)"
				+ "values (?,?,?,?,0)";
		
		Object[] data = {boardNo, boardTitle, boardContent,  boardWriter};

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		jdbcTemple.update(sql,data);
		System.out.println("게시글이 생성되었습니다");

	}

}
