package com.kh.spring15.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring15.dto.BookDto;
import com.kh.spring15.vo.BookComplexSearchVo;

@Repository
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BookDto> complexSearch(BookComplexSearchVo vo) {
		List<BookDto> list = sqlSession.selectList("book.complexSearch", vo);
		return list;
	}
}
