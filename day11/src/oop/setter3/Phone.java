package oop.setter3;

public class Phone {
	String name;		//휴대폰이름
	String telecom;	//통신사
	int price;			//판매가
	int month;			//약정개월

	void setName(String name) {
		this.name = name;
	}
	void setTelecom(String telecom) {
		switch(telecom) {
		case "SK":
		case "KT":
		case "LG":
			this.telecom = telecom;
		}
	}
//	void setPrice(int price) {
//		if(price >= 0) {
//			this.price = price;
//		}
//	}
	void setPrice(int price) {
		if(price < 0) {
			return;
		}
		this.price = price;
	}
//	void setMonth(int month) {
//		if(month == 0 || month == 24 || month == 36) {
//			this.month = month;
//		}
//	}
	void setMonth(int month) {
		switch(month) {
		case 0: case 24: case 36:
			this.month = month;
		}
	}

	//메소드 오버로딩(method overloading)
	void setup(String name, String telecom, int price) {
		this.setup(name, telecom, price, 0);
	}
	void setup(String name, String telecom, int price, int month) {
		this.setName(name);
		this.setTelecom(telecom);
		this.setPrice(price);
		this.setMonth(month);
	}
	void show() {
		System.out.println("<휴대폰 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.telecom);

		if(this.month == 0) {//약정이 없다면
			int discount = this.price * 5 / 100;
			int result = this.price - discount;
			System.out.print("판매가 : " + result + "원");
			System.out.println("(원가 " + this.price +"원)");
		}
		else {//약정이 있다면
			int monthPrice = this.price / this.month;
			System.out.print("판매가 : " + this.price + "원");
			System.out.println("(월 "+monthPrice+"원)");
		}

		if(this.month == 0) {
			System.out.println("약정 없음");
		}
		else {
			System.out.println("약정기간 : " + this.month+"개월");
		}
	}
}

