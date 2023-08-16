package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
	void insert(BoardDto boardDto);
	int sequence();
	BoardDto selectOne(int boardNo);
	List<BoardDto> selectList();
	boolean delete(int boardNo);
	boolean update(BoardDto boardDto);
	boolean updateUtime(int boardNo);
	boolean updateReadcount(int boardNo);
}
