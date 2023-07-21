package jdbc2;

public class Test03 {

	public static void main(String[] args) {
		// 사용자에게 정보를 입력받아 Board 테이블의 항목을 수정하는 프로그램을 구현
		//성공/실패로 결과를 구분하여 출력
		//가능한 모든 정보를 변경하도록 처리
		Scanner sc = new Scanner(System.in);
		int boardNo = 1;
		System.out.print("게시글 제목 수정: ");
		String boardTitle = sc.next();
		System.out.print("게시글 내용 수정: ");
		String boardCotent = sc.next();
		System.out.print("글쓴이 수정: ");
		String boardWriter = sc.next();
		int readCount = 0;
		sc.close();
		
		String sql = "update board set board_title=?, board_content=?, board_writer=? "
				+ "where board_no=?";
		Object[] data = {boardTitle, boardCotent, boardWriter};
		
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
