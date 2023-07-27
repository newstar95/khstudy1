package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.PocketmonDao;
import com.kh.spring05.dto.PocketmonDto;

@RestController //등록하고
public class PocketmonController {
	@Autowired //필요한 거 주세요
	private PocketmonDao dao;
	
	//@ModelAttribute는 필드에 값을 채우는 명령
	@RequestMapping("/insert")
	public String insert(@ModelAttribute PocketmonDto dto) {
		// @RequestParam // 낱개로 받고 싶을 때 지정하는 키워드
		dao.insert(dto);
		return "포켓몬 등록 완료!";
	}
}
