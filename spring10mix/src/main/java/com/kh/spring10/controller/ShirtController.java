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
import com.kh.spring10.dao.ShirtSizeDao;
import com.kh.spring10.dto.ShirtDto;
import com.kh.spring10.dto.ShirtSizeDto;

@Controller
@RequestMapping("shirt") //공용주소는 GET/POST 지정 불가
public class ShirtController {
	
	@Autowired
	ShirtDao dao;
	
	@Autowired
	private ShirtSizeDao sizeDao;
	
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
	
//	(추가) 만약 사이즈까지 같이 등록하는 경우라면...
	@GetMapping("/add2")
	public String add2() {
		return "/WEB-INF/views/shirt/add2.jsp";
	}

	@PostMapping("/add2")
	public String add2(
			@ModelAttribute ShirtDto shirtDto,
			@RequestParam List<String> size) {
		int shirtNo = dao.sequence();
		shirtDto.setShirtNo(shirtNo);
		dao.insert(shirtDto);

		for(String s : size) {
			ShirtSizeDto sizeDto = new ShirtSizeDto();
			sizeDto.setShirtNo(shirtNo);
			sizeDto.setShirtSizeName(s);
			sizeDao.insert(sizeDto);
		}

		return "redirect:detail2?shirtNo="+shirtNo;
	}
	
	@RequestMapping("/detail2")
	public String detail2(@RequestParam int shirtNo, Model model) {
		ShirtDto shirtDto = dao.selectOne(shirtNo);
		model.addAttribute("shirtDto", shirtDto);
		
		List<ShirtSizeDto> sizeList = sizeDao.selectList(shirtNo);
		model.addAttribute("sizeList",sizeList);
		
		return "/WEB-INF/views/shirt/detail2.jsp";
	}
	
	@GetMapping("/edit2")
	public String edit2(@RequestParam int shirtNo, Model model) {
		ShirtDto shirtDto = dao.selectOne(shirtNo);
		model.addAttribute("shirtDto", shirtDto); //셔츠 정보
		
		List<ShirtSizeDto> sizeList = sizeDao.selectList(shirtNo);
		model.addAttribute("sizeListt", sizeList); //사이즈 목록 정보
		
		return "/WEB-INF/views/shirt/edit2.jsp";
	}
	
	@PostMapping("/edit2")
	public String edit2(@ModelAttribute ShirtDto shirtDto, 
					@RequestParam List<String> size) {
		boolean result = dao.update(shirtDto);
		if(result) {
			//사이즈 삭제 후 추가
			sizeDao.delete(shirtDto.getShirtNo());
			for(String s : size) {
				ShirtSizeDto sizeDto = new ShirtSizeDto();
				sizeDto.setShirtNo(shirtDto.getShirtNo());
				sizeDto.setShirtSizeName(s);
				sizeDao.insert(sizeDto);
			}
			return "redirect:detail2?shirtNo="+shirtDto.getShirtNo();
		}
		else {
			return "redirect:에러페이지";
		}
	}
}