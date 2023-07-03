package oop.modifier2;

public class Bankbook {
	//2년짜리 적금이면 25번을 넣어야 만기
	//25가 되면 만기 됐다는 표시 찍기
	
	private String name;
	private int period, price;
	private long payment;

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPeriod(int period) {
		switch (period) {
		case 1: case 2: case 3: case 5: case 10:
		this.period = period;
		}
		
	}
	
	public void setPrice(int price) {
		if (price % 10000 == 0) return;
		this.price = price;
	}
	
	public void setPayment(long payment) {
		if(payment > 0);
		this.payment = payment;
	}
	
	
	
	public String getName() {
		this.setName(name);
		return name;
	}
	
	public int getPeriod() {
		this.setPeriod(period);
		return period;
	}
	
	public int getPrice() {
		this.setPrice(price);
		return price;
	}
	
	public long getPayment() {
		this.setPayment(payment);
		return payment;
	}
	
	public int getExpiry() { //만기
		return this.getPeriod() * 12 + 1;
	}
	
	public long getTurn() { 
		return this.getPayment() / getPrice();
	}
	
	public Bankbook(String name, int period, int price) {
		this(name, period, price, 0);
	}
	
	public Bankbook(String name, int period, int price, long payment) {
		this.setName(name);
		this.setPeriod(period);
		this.setPrice(price);
		this.setPayment(payment);
	}
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("예금주: " + this.getName());
		System.out.println("총 납입기간: " + this.getPeriod()+"년");
		System.out.println("현재 납입 회차: " + this.getTurn() + "회차");
		System.out.println("월 납입금액: " + this.getPrice() + "만원");
		System.out.println("총 잔액: " + this.getPayment() +"만원");
		}
		
	}

