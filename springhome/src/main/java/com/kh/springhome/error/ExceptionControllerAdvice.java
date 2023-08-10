package com.kh.springhome.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 컨트롤러를 간섭하여 예외 상황을 다르게 처리하도록 하는 객체
 - 등록 시 @ControllerAdvice 라고 등록
 만약 @RestController 를 간섭할 경우는 @RestControllerAdvice 를 사용
 - 적용 대상을 옵션으로 지정
 */

//컨트롤러를 간섭하는 객체
//@ControllerAdvice(basePackages = {"com.kh.springhome.controller"})
@ControllerAdvice(annotations = {Controller.class})//이 줄을 주석처리하면 예외발생이 해제된다.
public class ExceptionControllerAdvice {
	/*
	 예외는 @ExceptionHandler 메소드로 처리 가능
	 - 처리할 예외의 종류 지정 가능
	 - 메소드의 형태는 컨트롤러와 같음
	 - try 구문의 catch 블록과 같은 역할을 수행
	 */
	
	@ExceptionHandler(Exception.class)
	public String error() {
		return "/WEB-INF/views/error/500.jsp"; //프로그램 내에서 실행 중에 문제가 생긴 코드 500
	}

}






