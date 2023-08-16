package com.kh.springhome.mapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardDto;

@Component
public class BoardListMapper implements RowMapper<BoardDto>  {

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto boardListDto = new BoardDto();
		boardListDto.setBoardNo(rs.getInt("board_no"));
		boardListDto.setBoardWriter(rs.getString("board_writer"));
		boardListDto.setBoardTitle(rs.getString("board_title"));
		boardListDto.setBoardReadcount(rs.getInt("board_readcount"));
		boardListDto.setBoardLikecount(rs.getInt("board_likecount"));
		boardListDto.setBoardReplycount(rs.getInt("board_replycount"));
		boardListDto.setBoardCtime(rs.getDate("board_ctime"));
		boardListDto.setBoardUtime(rs.getDate("board_utime"));
		return boardListDto;
	}
	

}
