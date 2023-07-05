package oop.inherit7;

//추상클래스를 상속받으면 추상메소드를 해결(재정의)해야 한다.
public final class Galaxy23s extends Galaxy {
	
	public Galaxy23s(String number, String color) {
		super(number, color);
	}
	
	//고유 기능
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
