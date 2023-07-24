package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.mapper.BoardMapper;
import jdbc.util.jdbcUtils;

public class Test03 {

	public static void main(String[] args) {
		//게시판 테이블(Board) 정보 조회 후 출력
		//- 준비물 : BoardDto, BoardMapper
		
		//게시글은 나중에 쓴 게 먼저 나오기 때문에 desc
		String sql = "select * from board order by board_no desc";
		
		BoardMapper mapper = new BoardMapper();
		JdbcTemplate jdbcTemplate = jdbcUtils.getJdbcTemplate();
		List<BoardDto> list = jdbcTemplate.query(sql, mapper);
		
		for(BoardDto dto : list) {
			System.out.println(dto);
		}
		
	}

}
