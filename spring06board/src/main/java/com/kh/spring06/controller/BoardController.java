package com.kh.spring06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/update")
	public String update(@ModelAttribute BoardDto dto) {
		if(dao.update(dto)) {
			return "게시글 변경 완료";
		}
		else {
			return "존재하지 않는 글 번호";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boolean result = dao.delete(boardNo);
		if(result) {
			return "게시글 삭제 완료";
		}
		else {
			return "존재하지 않는 글 번호";
		}
	}
	
	@RequestMapping("/list")
	public String list() {
		List<BoardDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();//safe
		for(BoardDto dto : list) {
			buffer.append("[");
			buffer.append(dto.getBoardNo());
			buffer.append("]");
			buffer.append(" ");
			buffer.append(dto.getBoardTitle());
			buffer.append(" - ");
			buffer.append(dto.getBoardWriter());
			buffer.append(" (조회수 : ");
			buffer.append(dto.getBoardReadcount());
			buffer.append(")");
			buffer.append("<br>");
		}
		return buffer.toString();
	}

	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo) {
		BoardDto dto = dao.selectOne(boardNo);
		if(dto == null) {
			return "게시글이 존재하지 않습니다";
		}
		else {
			//return dto.toString();
			StringBuffer buffer = new StringBuffer();
			buffer.append("[제목]" + dto.getBoardTitle());
			buffer.append("("+dto.getBoardWriter()+")");
			buffer.append("<br>");
			buffer.append("---------------------------");
			buffer.append("<br>");
			buffer.append(dto.getBoardContent());
			buffer.append("<br>");
			return buffer.toString();
		}
	}
}
