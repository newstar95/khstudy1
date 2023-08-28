package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BasketDto;

public interface BasketDao {
		//등록 
		void insert(BasketDto basketDto);
		//목록
		public List<BasketDto> selectList();
		//상세
		BasketDto selectOne(int basketNo);
		//수정
		boolean update(BasketDto basketDto);
		//삭제
		boolean delete(int basketNo);
	}
