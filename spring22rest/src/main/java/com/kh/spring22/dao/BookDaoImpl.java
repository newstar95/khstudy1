package com.kh.spring22.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.BookDto;

@Repository
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private SqlSession sqlSession;

}
