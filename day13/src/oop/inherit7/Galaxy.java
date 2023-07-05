package oop.inherit7;

public abstract class Galaxy extends Mobile {

	public Galaxy(String number, String color) {
		super(number, color);
	}
	
	//숨어있는 메소드
	//public abstract void call();
	//public abstract void sms();

	public abstract void samsungPay();
}
