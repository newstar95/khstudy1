package oop.constructor1;

public class Student {
	String name;
	int score;
	
	//기본 생성자 - 생성만 하고 아무 짓도 안 함
	//- 한 개도 없으면 자동생성
	//- 생성자가 없으면 객체생성 불가
	//Student(){}
	
	//-생성자의 이름은 클래스 이름
	
	//하는 일은 setup 메소드와 동일
	//-생성자도 오버로딩이 가능
	Student(String name){
		this.name = name;
		this.score = 0;
	}
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
}
