package condition2;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		//사용자에게 입력 받을 신장
		System.out.print("신장: ");
		int cm = sc.nextInt();
		//사용자에게 입력 받을 체중
		System.out.print("체중: ");
		int kg = sc.nextInt();

		//계산
		//BMI수치 계산
		//몸무게 / 키(M) / 키(M)
		double m = (double)cm / 100;
		double bmi = kg / (m * m);
		
		String s;
		if ( bmi < 18.5 ) {
			s = "저체중";
		} else if ( bmi < 23 ) {
			s = "정상";
		} else if ( bmi < 25 ) {
			s = "과체중";
		} else if ( bmi < 30 ) {
			s = "경도비만";
		} else {
			s = "중등도비만";
		}
		
		//출력
		System.out.println("bmi 수치: " + bmi);
		System.out.println("이므로 " + s + "입니다." );
	}
}
