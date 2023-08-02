package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.PocketmonDto;
import com.kh.spring10.mapper.PocketmonMapper;

//DAO 클래스
//= Spring에 등록해야됨
//= JdbcTemplate을 주세요 해야됨(DI, 의존성 주입
// 이 클래스는 스프링에 등록한 클래스가 아니기 때문에 그냥 주세요 하면 
//		등록이 안 됨
//= @Repository로 등록한다. (영원히 변하지 않는 것을 다루는 객체, 
//										영속성 제어 객체)
// DB나 파일을 제어하는 애들한테 @Repository를 붙임
@Repository
public class PocketmonDao {
	//주세요
	//(주의) 등록을 하지 않으면 절대로 주지 않음
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PocketmonMapper mapper;
	
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon(no, name, type) "
				+ "values(?, ?, ?)";
		Object[] data = {
				dto.getNo(), dto.getName(), dto.getType()
		};
		jdbcTemplate.update(sql,data);
	}
	
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon "
				+ "set name = ?, type = ? "
				+ "where no = ?";
		Object[] data = {
				dto.getName(), dto.getType(), dto.getNo()
		};
		return jdbcTemplate.update(sql,data) > 0;
	}

	public boolean delete(int no) {
		String sql = "delete pocketmon where no = ?";
		Object[] data = {no};
		return jdbcTemplate.update(sql,data) > 0;
	}
	
	public List<PocketmonDto> selectList(){
		String sql ="select * from pocketmon order by no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public PocketmonDto selectOne(int no) {
		String sql = "select * from pocketmon where no = ?";
		Object[] data = {no};
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
}
