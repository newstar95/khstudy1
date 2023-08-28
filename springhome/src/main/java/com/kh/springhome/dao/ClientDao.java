package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.ClientDto;

public interface ClientDao {
	//등록
	void insert(ClientDto clientDto);
	//목록
	public List<ClientDto> selectList();
	//상세
	ClientDto selectOne(String clientId);
	//수정
	boolean update(ClientDto clientDto);
	//삭제
	boolean delete(String clientId);
}
