package oop.modifier2;

public class Bank {
	String name;
	int period, price, payment;
	//2년짜리 적금이면 25번을 넣어야 만기
	//25가 되면 만기 됐다는 표시 찍기
	
	void setName(String name) {
		this.name = name;
	}
	
	void setPeriod(int period) {
		switch (period) {
		case 1: case 2: case 3: case 5: case 10:
		this.period = period;
		}
	}
	
	void setPrice(int price) {
		if (price % 10000 == 0)
		this.price = price;
	}
	
	void setPayment(int payment) {
		if(payment > 0);
		this.payment = payment;
	}
	
	
	String getName() {
		return name;
	}
	
	int getPeriod() {
		return period;
	}
	
	int getPrice() {
		return price;
	}
	
	int getPayment() {
		return payment;
	}
	
	
	public int getExpiry() { //만기
		return this.getPeriod() * 12 + 1;
	}
	
	public int getTurn() { 
		return this.getPayment() / this.getPrice();
	}
	
	public Bank(String name, int period, int price, int payment) {
		this.setName(name);
		this.setPeriod(period);
		this.setPrice(price);
		this.setPayment(payment);
	}
	
	public Bank(String name, int period, int price) {
		this(name, period, price, 0);
	}
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("예금주: " + this.getName());
		System.out.println("총 납입기간: " + this.getPeriod()+"년");
		System.out.println("현재 납입 회차: " + this.getTurn());
		System.out.println("월 납입금액: " + this.getPrice());
		System.out.println("총 잔액: " + this.getPayment());
		
	}

}
