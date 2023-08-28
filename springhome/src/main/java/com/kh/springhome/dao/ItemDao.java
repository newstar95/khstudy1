package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.ItemDto;

public interface ItemDao {
	//등록 
	void insert(ItemDto itemDto);
	//목록
	public List<ItemDto> selectList();
	//상세
	ItemDto selectOne(int itemNo);
	//수정
	boolean update(ItemDto itemDto);
	//삭제
	boolean delete(int itemNo);
}

	
	
