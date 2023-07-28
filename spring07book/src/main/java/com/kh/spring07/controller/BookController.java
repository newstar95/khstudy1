package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.BookDao;
import com.kh.spring07.dto.BookDto;

@RestController
public class BookController {
	@Autowired
	private BookDao dao;
	
	//등록
	@RequestMapping("/save")
	public String save(@ModelAttribute BookDto dto) {
		dao.insert(dto);
		return "도서 등록 완료!";
	}
	
	//변경
	@RequestMapping("/edit")
	public String edit(@ModelAttribute BookDto dto) {
		boolean result = dao.update(dto);
		if (result) {
			return "도서 변경 완료!";
		} else {
			return "도서를 찾을 수 없습니다.";
		}

	}
	
	//삭제
	@RequestMapping("delete")
	public String delete(@RequestParam int bookId) {
		boolean result = dao.delete(bookId);
		if (result) {
			return "도서 정보 삭제 완료!";
		} else {
			return "도서를 찾을 수 없습니다.";
		}
	}
	
	//목록
	@RequestMapping("/list")
	public String list() {
		List<BookDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();
		for(BookDto dto : list) {
			buffer.append(dto);
			buffer.append("<br>");
			}
			return buffer.toString();
	}
	
	//상세
	@RequestMapping("/detail")
	public String detail(@RequestParam int bookId) {
		BookDto dto = dao.selectOne(bookId);
		if(dto == null) {
			return "존재하지 않는 게시글";
			} else {
				return dto.toString();
			}
	}
	
}
