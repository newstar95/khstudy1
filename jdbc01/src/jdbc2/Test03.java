package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//게시글 정보 수정 프로그램
		//데이터
		int boardNo = 1;
		System.out.print("게시글 제목 수정: ");
		String boardTitle = sc.next();
		System.out.print("게시글 내용 수정: ");
		String boardCotent = sc.next();
		sc.close();
		
		//DB처리 "update board set 변경내용 where board_no=?
		String sql = "update board set board_title=?, board_content=? "
				+ "where board_no=?";
		Object[] data = {boardTitle, boardCotent, boardNo};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		jdbcTemple.update(sql, data);
		
		int result = jdbcTemple.update(sql,data);
		
		if(result > 0) {
			System.out.println("게시글 수정 완료");
		} else {
			System.out.println("게시글 수정 실패");
		}

	}

}