package random;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		
		Random r = new Random();	 
		
		int lotto = r.nextInt(45) + 1;
		int number = r.nextInt(90) + 1;
		int otp = r.nextInt(1000000);
		int two = r.nextInt(2 + 1);
		int rsp = r.nextInt(3 + 1);
		
		System.out.println("무작위 로또 번호: " + lotto);
		System.out.println("무작위 두 자리 정수 1개: " + number);
		System.out.println("무작위 OTP 번호 1개: " + otp);
		
		String frontBack;
		String rspResult;
		
		if (two == 1) {
			frontBack = "앞";
		} else {
			frontBack = "뒤";
		}
		System.out.println("무작위로 앞, 뒤 출력: " + frontBack);
		
		switch (rsp) {
		case 1: 
			rspResult = "가위";
			break;
		case 2:
			rspResult = "바위";
			break;
		default:
			rspResult = "보";
		}
		System.out.println("무작위로 가위, 바위, 보 출력: " + rspResult);
		
	}
}
