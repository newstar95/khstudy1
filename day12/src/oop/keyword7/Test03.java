package oop.keyword7;

import java.util.Random;

public class Test03 {
	
	static final int scissors = 0;
	static final int rock = 1;
	static final int paper = 2;

	public static void main(String[] args) {
		//상수(constant)의 필요성?
		//ex) 가위바위보 출력

		Random r = new Random();//랜덤이라는 클래스에 객체를 생성하는 코드
		
		int choice = r.nextInt(3);
		
//		System.out.println("choice = " + choice);
		
		
		//switch case에는 변수를 적지 못 한다.
		switch(choice) {
		case RSPGame.scissors:
			System.out.println("가위");
			break;
		case RSPGame.rock: 
			System.out.println("바위");
			break;
		case RSPGame.paper:
			System.out.println("보");
			break;
		}
		
		
	}

}
