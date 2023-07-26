package com.kh.spring03.controller;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController //애노테이션(Annotation) - 역할 정의
public class QuizController {
	
	Random r = new Random();
	
	@RequestMapping("/dice")
	public String dice(){
		int dice = r.nextInt(6)+1;
		//System.out.println("주사위 : " + dice); //의미없음(사용자한테 안 보임)
		return "주사위: " + dice;
	}
	@RequestMapping("/lotto")
	public int lotto() {
		int lotto = r.nextInt(45)+1;
		return lotto;
	}
	
	//파라미터 관련 문제
	
	//(추가) 스프링은 역할을 명시하는 것을 선호한다.
	// - @RequestParam을 변수 앞에 붙여 파라미터임을 표시
	//<숫자를 입력해 제곱을 나타내는 문제>
	@RequestMapping("/square")
	public String square(@RequestParam int num) {
		return "제곱 = " + num*num;
	}
	
	//<연도를 입력해 요금을 나타내는 문제>
	//(추가) 연도가 주어지지 않으면 실행을 안 할 건가?
	//- 파라미터가 없어도 실행되어야 하는 상황(ex: 기본값)
	//- 만약 birth가 제공되지 않는다면 성인 요금을 부여
	//- 명찰을 붙이면 역할에 +@ 옵션을 부여할 수 있다.
	//- @RequestParam에 required = false 옵션을 주면 없어도 된다.
	//- int에 null을 넣을 수 없는데...? -> 1. integer를 쓰면 됨 2. 기본값을 쓰면 됨
	//- @RequestParam에 defaultValue를 설정하여 기본값을 지정(반드시 문자열로 지정)
	//- 파일과 네트워크에서는 기본 전송단위가 byte이다. 
	//- 통신으로 오고 가는 모든 데이터는 문자열이다.
	@RequestMapping("/subway")
	public String subway(
			//birth가 파라미터인데 없을 수도 있고 없다면 기본값은 2000이야!
			@RequestParam(required = false, defaultValue = "2000") int birth) {
		int age = LocalDate.now().getYear() - birth + 1;
		//int price = 1250 or 720 or 450 or 0;
		int price;
		if (65 <= age || 8 > age) {
			price = 0;
		} else if (age >= 20) {
			price = 1250;
		} else if (age >= 14) {
			price = 720;
		} else {
			price = 450;
		}
		return "요금 = " + price + "원";
	}
	
	//<연도를 입력해 윤년인지 판단하는 문제>
	@RequestMapping("/leap")
	//없으면 계산이 안 되기 떄문에 required는 생략
	public String leap(@RequestParam int year) {
		boolean isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 == 0); 
		if(isLeap){
			return "윤년입니다";
		} else
			return "윤년이 아닙니다";
	}
	
	//<숫자를 입력해 원의 반지름을 구하는 문제>
	@RequestMapping("/circle")
	public String circle(@RequestParam int r) {
		double area = Math.PI * r * r;
		return "원의 넓이 = " + area;
	}
	
}