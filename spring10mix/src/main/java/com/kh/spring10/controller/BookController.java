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

import com.kh.spring10.dao.BookDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.BookDto;

@Controller
@RequestMapping("book")
public class BookController {
	@Autowired
	private BookDao dao;
	
	//상세
	@RequestMapping("detail")
	public String detail(@RequestParam int bookId, Model model) {
		BookDto dto = dao.selectOne(bookId);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/book/detail.jsp";
	}
	
	//목록
	@RequestMapping("/list")
	public String list(Model model) {
		List<BookDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/book/list.jsp";
	}
	
	//등록
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/book/insert.jsp";
	}
	
	@PostMapping("/insert") //처리 후 제3의 페이지로 넘기는 게 목적
	public String insert(@ModelAttribute BookDto dto) {
		dao.insert(dto);
		return "redirect:list";
	}
	
	//수정
	@GetMapping("/edit")
	public String edit(@RequestParam int bookId, Model model) {
//		model.addAttribute("dto", dao.selectOne(bookId)); 
		BookDto dto = dao.selectOne(bookId);
		model.addAttribute("dto",dto);
		
		return "/WEB-INF/views/book/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BookDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "redirect:detail?bookId="+dto.getBookId();
		} else {
			return "redirect:에러페이지주소";
		}
	}
	

}
