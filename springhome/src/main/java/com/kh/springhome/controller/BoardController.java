package com.kh.springhome.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.NoTargetException;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardDao boardDao;
	
	@Autowired
	MemberDao memberDao;
	
	@GetMapping("/write")
	public String insert() {
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String insert(@ModelAttribute BoardDto boardDto, HttpSession session) {
		String boardWriter = (String) session.getAttribute("name"); //세션에 있는 memberId를 가져옴
		int boardNo = boardDao.sequence(); //시퀀스 번호 가져옴
		boardDto.setBoardNo(boardNo); //보드 번호 넣음
		boardDto.setBoardWriter(boardWriter); //보드 작성자 넣음
		boardDao.insert(boardDto); //입력
		return "redirect:detail?boardNo=" + boardNo;
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
//		if() {
			boardDao.updateReadcount(boardNo); //조회수
//		}
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return  "/WEB-INF/views/board/detail.jsp";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
//		List<BoardDto> list = boardDao.selectList();
//		model.addAttribute("list", list);
		model.addAttribute("list", boardDao.selectList());
		return "/WEB-INF/views/board/list.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boolean result = boardDao.delete(boardNo);
		if (result) {
			return "redirect:list";
		} else {
			throw new NoTargetException("없는 게시글 번호");
		}
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto) {
		boolean result = boardDao.update(boardDto);
//		boardDao.updateUtime(boardDto.getBoardNo()); //수정일 입력
		if (result) {
			return "redirect:detail?boardNo="+ boardDto.getBoardNo();
		}
		else {
			throw new NoTargetException("존재하지 않는 글번호입니다.");
		}
	}
}
