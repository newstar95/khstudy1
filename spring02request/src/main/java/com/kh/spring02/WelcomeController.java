package com.kh.spring02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러
//- 사용자가 접속할 수 있도록 특정 주소를 서비스하는 도구
//- 클래스 상단에 @Controller 또는 @RestController를 붙인다.
//- 한 개 또는 여러 개 만들어도 상관없다.
@RestController
public class WelcomeController {

	//매핑
	//- 사용자가 접속할 수 있는 주소를 메소드 단위로 생성
	//- @RequestMapping 표시를 하고 () 안에 추가 주소를 작성
	//- 사용자가 받아야 하는 결과를 반환하도록 처리
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Framework!";
	}
}
