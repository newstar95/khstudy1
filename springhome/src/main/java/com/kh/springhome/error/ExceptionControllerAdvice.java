package com.kh.springhome.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

/*
 컨트롤러를 간섭하여 예외 상황을 다르게 처리하도록 하는 객체
 - 등록 시 @ControllerAdvice 라고 등록
 만약 @RestController 를 간섭할 경우는 @RestControllerAdvice 를 사용
 - 적용 대상을 옵션으로 지정
 */
@Slf4j
//컨트롤러를 간섭하는 객체
//@ControllerAdvice(basePackages = {"com.kh.springhome.controller"})
@ControllerAdvice(annotations = {Controller.class})//이 줄을 주석처리하면 예외발생이 해제된다.
public class ExceptionControllerAdvice {
	/*
	 예외는 @ExceptionHandler 메소드로 처리 가능
	 - 처리할 예외의 종류 지정 가능
	 - 메소드의 형태는 컨트롤러와 같음
	 - try 구문의 catch 블록과 같은 역할을 수행
	 - 이 메소드에는 컨트롤러처럼 매개변수를 선언하면 사용할 수 있다.
	 	- Model, HttpSession 등 기본적인 컨트롤러의 도구 사용 가능
	 	- catch 처럼 예외 처리 객체를 선언할 수 있다.
	 */
	
	@ExceptionHandler(Exception.class)
	public String error(Exception e) {
//		e.printStackTrace(); //로그가 찍힘
		//에러 로그에는 예외 객체를 한 개 첨부시킬 수 있다.(자동 print stack trace)
		log.error("오류", e);
		return "/WEB-INF/views/error/500.jsp"; //프로그램 내에서 실행 중에 문제가 생긴 코드 500
	}

//스프링이 인식하지 못하는 예외
//- 실행은 됐지만 적용대상이 없음

/*
 내가 지정한 예외들을 처리하도록 추가 핸들러(처리기) 설정
 */

	@ExceptionHandler(NoTargetException.class)
	public String noTarget(NoTargetException e) {
		return "/WEB-INF/views/error/noTarget.jsp";
	}
	
	@ExceptionHandler(AuthorityException.class)
	public String authority(AuthorityException e) {
		e.printStackTrace();
		return "/WEB-INF/views/error/authority.jsp";
	}
}






