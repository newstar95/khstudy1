package com.kh.spring10.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.dto.PocketmonDto;

//포켓몬스터 시스템을 처리하는 컨트롤러
@Controller //화면을 사용할 계획
@RequestMapping("/pocketmon")
public class PocketmonController {
	@Autowired 
	private PocketmonDao dao;
	
	//상세조회
	//- 번호(no)를 받아서 포켓몬스터정보(PocketmonDto)를 조회
	//- 화면(JSP)에 전달하도록 모델(Model)에 첨부
	@RequestMapping("/detail")
	public String detail(@RequestParam int no, Model model) {
		PocketmonDto dto = dao.selectOne(no);
		model.addAttribute("dto",dto);
		return "/WEB-INF/views/pocketmon/detail.jsp";
	}
	
	
	//목록
	@RequestMapping("/list")
	public String list(Model model) {
		List<PocketmonDto> lsit = dao.selectList();
		model.addAttribute("list", lsit);
		return "/WEB-INF/views/pocketmon/list.jsp";
	}
	
	//등록
	//- 등록은 주소를 둘로 나눠서 쓴다.
	//- GET(입력), POST(처리)
//	@RequestMapping("/insert")
//	@RequestMapping(value ="/insert", method = RequestMethod.GET)//클래식한 방법
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/pocketmon/insert.jsp";
	}
	
//	@RequestMapping(value ="/insert", method = RequestMethod.POST)//클래식한 방법
	@PostMapping("/insert")
	public String insert(@ModelAttribute PocketmonDto dto) {
		dao.insert(dto);
		//더이상 할 일이 없으므로 다른 페이지로 강제 이동(리다이렉트, redirect)
		//반환하는 문자열이 redirect: 로 시작하면 스프링이 리다이렉트 처리
//		return "redirect:list"; //상대경로
		return "redirect:/pocketmon/list"; //절대경로
	}
	
	//수정
	//- 수정 역시 등록처럼 두 개의 매핑이 필요(작성, 처리)
	//- 전송방식으로 구분하여 구현
	//- 화면에 기존 정보를 표시할 수 있도록 조회하여 전달
	
	@GetMapping("/edit")
	public String edit(@RequestParam int no, Model model) { //번호를 받아서 넘겨주겠다
		PocketmonDto dto = dao.selectOne(no);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/pocketmon/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute PocketmonDto dto) {
		boolean result = dao.update(dto);
		if(result) { //성송 시 상세 페이지로 리다이렉트
			return "redirect:detail?no="+dto.getNo(); //성공 시 어떻게 처리하는가? 중요!
		}
		else{
			return "redirect:에러페이지주소";
		}
		
	}
	
	//삭제
	@RequestMapping("/delete")
	public String delete(@RequestParam int no) { //화면이 없어서 Model이 필요가 없다
		boolean result = dao.delete(no);
		if (result){
			//return "redirect:/pocketmon/list";
			return "redirect:list";
		} else {
			return "redirect:에러페이지";
		}
	}
}
