package oop.inherit6;

public class Phone {
	protected String number;
	protected String color;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public final void show() {
		System.out.println("<휴대폰 정보>");
		System.out.println("전화번호: " + number);
		System.out.println("색상정보: " + color);
	}
	
	public void call() {
	}
	
	public void sms() {
	}
	
	public Phone(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
}
