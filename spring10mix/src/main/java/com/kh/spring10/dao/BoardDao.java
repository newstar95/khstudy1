package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardDetailMapper;
import com.kh.spring10.mapper.BoardListMapper;

@Repository
public class BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardListMapper listMapper;
	
	@Autowired
	private BoardDetailMapper detailMapper;
	
	//등록과 번호 생성 기능을 각각 구현
	//select board_seq.nextval from dual
	//insert into board(...) values(?, ?, ?, ?, 0) 
	//원래 시퀀스였던 부분들을 홀더로 대체 (번호를 미리 뽑았기 때문에)
	
	//번호 생성 메소드 public 번호 sequence(){
	public int sequence() {
		String sql = "select board_seq.nextval from dual";
		//홀더가 없으니 Object[] data가 필요 없고 select니까 query가 필요, mapper 필요x 값이 하나밖에 없기때문
		return jdbcTemplate.queryForObject(sql, int.class);
//		return jdbcTemplate.queryForObject(sql, Integer.class);
		//count, max, min, sum은 조회하면 값이 하나만 나옴, .class는 내가 추출할 자료형을 알려줌, 자료형이라는 것을
		//전달할 때 쓰는 표현 int 형태라고 해석하면 된다. 자료형을 알려주면 그 형태를 준다. 

	}
	
	public void insert(BoardDto dto) {
		String sql = "insert into board(board_no, board_title, board_content, board_writer, "
				+ "board_readcount) values(?, ?, ?, ?, 0)"; //번호, 제목, 내용, 작성자, 조회수
		Object[] data = {
				dto.getBoardNo(), dto.getBoardTitle(), dto.getBoardContent(), dto.getBoardWriter()
		};
		jdbcTemplate.update(sql,data);
	}
	
	//수정
	public boolean update(BoardDto dto) {
		String sql = "update board "
						+ "set board_title=?, board_content=? "
						+ "where board_no=?";
		Object[] data = {
				dto.getBoardTitle(), dto.getBoardContent(), 
				dto.getBoardNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//삭제
	public boolean delete(int boardNo) {
		String sql = "delete board where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//목록조회
	public List<BoardDto> selectList() {
		//String sql = "select * from board order by board_no desc";
		String sql = "select "
							+ "board_no, board_title, "
							+ "board_writer, board_readcount "
						+ "from "
						+ "board order by board_no desc";
		return jdbcTemplate.query(sql, listMapper);
	}
	
	//상세조회
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
		Object[] data = {boardNo};
		
		List<BoardDto> list = jdbcTemplate.query(sql, detailMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
}