package oop.setter;

public class Student {
	//필드가 만들어져야 클래스의 나머지 형태를 구성할 수 있다.
	
	String name;
	int score;
	
	//메소드 - setup, show
	void setup(String name, int score) {
		this.setName(name); //내가 가진 setName 메소드에 name을 전달하며 호출하겠다.
		this.setScore(score); //내가 가진 setScore 메소드에 score를 전달하며 호출하겠다.
		
	}

	void show() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
	
	//필드를 하나씩 변경할 수 있는 메소드를 구현 - Setter 메소드
	//- set + 필드명으로 이름을 짓는다.
	//- 설정 외에 다른 작업을 하지 않는다.
	// - (중요) 올바른 데이터만 설정 가능하도록 필터링 처리를 한다.
	
	void setName(String name) { //이름에 대한 Setter 메소드
		switch(name) { //문자열은 비교를 switch로 한다.(if 방법은 나중에)
		case "피카츄":	//switch case는 정수랑 문자열만 사용 가능하다.
		case "라이츄":
			this.name = name;
		}
	}
	
	void setScore(int score) { //this.score 쓰면 안됨, 괄호 안에 있는 전달받은 score를 말하는 것.
		if (score >= 0 && score <= 100 ) {
			this.score = score;
		}
		
	}
	
}
