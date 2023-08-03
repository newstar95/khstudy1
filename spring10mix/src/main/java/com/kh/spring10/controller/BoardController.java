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

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dto.BoardDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	//상세
	@Autowired
	private BoardDao dao;
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		BoardDto dto = dao.selectOne(boardNo);
		model.addAttribute("dto",dto);
		return "/WEB-INF/views/board/detail.jsp";
	}
	//목록
	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/board/list.jsp";
	}
	
	//상세
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto dto) { //dto안에 데이터가 세 개 있음, 하나가 더 필요
		int boardNo = dao.sequence(); //번호를 구해서
		dto.setBoardNo(boardNo); //dto에 추가하고
		dao.insert(dto); //등록
		return "redirect:detail?boardNo="+boardNo; //방금 등록한 번호의 게시글 상세 페이지로 강제 이동!(redirect)
	}
	
	//수정
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model) { //번호를 받아서, 화면에 띄워줘야함
		BoardDto dto = dao.selectOne(boardNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto dto) {//Model과 ModelAttribute는 김과 김밥같은 존재, 이름만 비슷할뿐
		boolean result = dao.update(dto);
		
		if(result) {
			return "redirect:detail?boardNo="+dto.getBoardNo();
		} else {
			return "redirect:에러페이지주소";
		}
	}

}
