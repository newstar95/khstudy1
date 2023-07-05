package oop.inherit6;

public final class Galaxy23s extends Galaxy {
	
	public Galaxy23s(String number, String color) {
		super(number, color);
	}

	public void bixby() {
		System.out.println("갤럭시23s 음성인식 기능 실행");
	}

	@Override
	public void samsungPay() {
		System.out.println("갤럭시23s 삼성페이 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시23s 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시23s 문자 기능 실행");
	}
	
}
