package oop.setter2;

public class Academy {
	String subject; //강좌명
	int time; //강의시간
	int price; //수강료
	String type; //구분
	
	void setup(String subject, int time, int price, String type) {
		this.setSubject(subject);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	void setSubject(String subject) {
		this.subject = subject;
	}
	
	void setTime(int time) {
		if (time % 30 == 0 &&  time > 0) {
			this.time = time;
		}
				
	}
	
//	void setPrice(int price) {
//		if (price >= 0) {
//			this.price = price;
//		}
//	}
	
	void setPrice(int price) { //조건이 많을 때는 return을 쓰는 게 편하다.
		if(price < 0) {
			return; //반환은 없지만 중지하세요! 메소드에서는 반복문의 break를 쓰지 못하니 return을 씀
		}
		this.price = price;
	}
	
	
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		
		}
	}
	
	void show() {
		System.out.println("<강좌 정보>");
		System.out.println("이름: " + this.subject);
		System.out.println("시간: " + this.time + "시간");
		System.out.println("가격: " + this.price + "원");
		System.out.println("구분: " + this.type);
		
	}
	
}
