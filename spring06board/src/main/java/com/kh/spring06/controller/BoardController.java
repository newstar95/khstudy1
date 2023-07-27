package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.BoardDao;
import com.kh.spring06.dto.BoardDto;

@RestController
public class BoardController {

	@Autowired
	private BoardDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute BoardDto dto) {
		dao.insert(dto);
		return "게시글 작성 완료";
	}
	
	//보내는 건 컨트롤러
	@RequestMapping("/update")
	public String update(@ModelAttribute BoardDto dto) {
		if(dao.update(dto)) {
			return "게시글 변경 완료";
		} else {
			return "존재하지 않는 글 번호";
		}
	}
	
}
