package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.mapper.BoardMapper;
import jdbc.util.JdbcUtils;

public class Test03_1 {

	public static void main(String[] args) {
		//게시판 테이블 검색
		//- 준비물 : BoardDto, BoardMapper
		
		//게시글은 나중에 쓴 게 먼저 나오기 때문에 desc
		
		String keyword = "테스트";
		
		String sql = "select * from board "
				+ "where instr(board_title, ?) > 0"
				+ "order by board_no desc";
		Object[] data = {keyword};
		
		BoardMapper mapper = new BoardMapper();
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<BoardDto> list = jdbcTemplate.query(sql, mapper, data);
		
		if(list.isEmpty()) {
	//if(list.size() == 0) {
			System.out.println("게시글이 존재하지 않습니다");
		} else {
			for(BoardDto dto : list) {
				System.out.println(dto); //dto.toString()
				//System.out.println(dto.getBoardTitle()); //제목만 찍겠다
			}
		}
		
	}

}
