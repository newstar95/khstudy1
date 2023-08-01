package com.kh.spring09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/table") //공용주소 충돌 방지
public class TableController {
	
	@RequestMapping("/test01")
	 public String test01() {
		return "/WEB-INF/views/table/test01.jsp";
	}

}
