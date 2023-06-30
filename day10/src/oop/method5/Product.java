package oop.method5;

public class Product {
	String name;
	String type;
	int price;
	boolean delivery;
	boolean event;
	
	void setup(String name, String type, int price) {
		this.setup(name, type, price, false, false);
		
	}
	
	void setup(String name, String type, int price, boolean delivery, boolean event ) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.delivery = delivery;
		this.event = event;
	}
	
	void show() {
		System.out.println("<행사 정보>");
		System.out.println("상품명: " + this.name);
		System.out.println("상품종류: " + this.type);
		
		if (event) {
			System.out.println("가격 행사 중: " + price * 90/100 + "원");
		} else {
			System.out.print("가격: " + this.price + "원");
		}
		
		
		if (delivery) {
			System.out.println("새벽 배송 가능\n2500원의 배송비 추가");
		} else {
			System.out.println("새벽 배송 불가");
		}
		
	}
}
