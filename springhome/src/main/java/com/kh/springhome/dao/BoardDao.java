package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.vo.PaginationVO;

public interface BoardDao {
	void insert(BoardDto boardDto);
	int sequence();
	BoardDto selectOne(int boardNo);
	boolean delete(int boardNo);
	boolean update(BoardDto boardDto);
	
	boolean updateUtime(int boardNo);
	boolean updateReadcount(int boardNo);
	Integer selectMax(String boardWriter); //이 작성자가 쓴 마지막 글 번호를 알려줌
	
	List<BoardListDto> selectList(String type, String keyword);
	List<BoardListDto> selectList();
	
	List<BoardListDto> selectListByPage(int page);
	List<BoardListDto> selectListByPage(String type, String keyword, int page);
	List<BoardListDto> selectListByPage(PaginationVO vo);
	
	int countList();
	int countList(String type, String keyword);
	int countList(PaginationVO vo);
	
	//특정 사용자가 작성한 글을 조회하는 메소드
	List<BoardListDto> selectListByBoardWriter(String boardWriter);
}
