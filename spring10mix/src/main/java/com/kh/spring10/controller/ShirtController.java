package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.ShirtDao;
import com.kh.spring10.dto.ShirtDto;

@Controller
@RequestMapping("shirt")
public class ShirtController {
	
	@Autowired
	ShirtDao dao;
	
	//상세조회
	@RequestMapping("/detail")
	public String detail(@RequestParam int shirtNo, Model model) {
		ShirtDto dto = dao.selectOne(shirtNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/detail.jsp";
	}
	
	//목록조회
	@RequestMapping("/list")
	public String list(Model model) {
		List<ShirtDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/shirt/list.jsp";
	}
	
	//등록(get)
	@GetMapping("/add")
	public String add() {
		return "/WEB-INF/views/shirt/add.jsp";
	}
	
	//등록(post)
	@PostMapping("/add")
	public String add(@ModelAttribute ShirtDto dto) {
		int shirtNo = dao.sequence(); //번호 구해서 
		dto.setShirtNo(shirtNo); //dto에 추가하고
		dao.insert(dto); //등록
		return "redirect:detail?shirtNo="+shirtNo;
	}
	
	//수정(get)
	@GetMapping("/edit")
	public String edit(@RequestParam int shirtNo, Model model) {
		ShirtDto dto = dao.selectOne(shirtNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/edit.jsp";
	}
	
	//수정(post)
	@PostMapping("/edit")
	public String edit(@ModelAttribute ShirtDto dto) {
		boolean result = dao.update(dto);
		
		if (result) return "redirect:detail?shirtNo="+dto.getShirtNo();
		else return "redirect:error";
	}
	
	//삭제
	@RequestMapping("/delete")
	public String delete(@RequestParam int shirtNo) {
		boolean result = dao.delete(shirtNo);
		if (result) return "redirect:list";
		else return "redirect:error";
	}
	
	//에러페이지
	@RequestMapping("/error")
	public String error() {
		return "/WEB-INF/views/shirt/error.jsp";
	}

}
