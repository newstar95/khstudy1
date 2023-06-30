package oop.method3;

public class CompanyPrice {
	//멤버 필드(멤버 변수)
	String company;
	String product;
	int price;
	int data;
	int call;
	int message;
	
	//멤버 메소드;
							//매개변수
	void setup(String company, String product, int price, int data, int call, int message) {
		this.company = company;	///지역변수
		this.product = product;
		this.price = price;
		this.data = data;
		this.call = call;
		this.message = message;
		
	}
	
	void show() {
		System.out.println("<요금제 정보>");
		System.out.println("통신사: " + company);
		System.out.println("상품명: " + product);
		System.out.println("월정액: " + price + "원");
		System.out.println("데이터(GB): " + data + "GB");
		System.out.println("통화(분): " + call + "분");
		System.out.println("문자(건): " + message + "건");
	}

}
