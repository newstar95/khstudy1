package condition2;

import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		//BMI 측정기
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력(cm): ");
		float height = sc.nextFloat() ; //자동 형변환(묵시적 변환)
		System.out.print("몸무게 입력(kg): ");
		float weight = sc.nextFloat();
		
		//계산
		float heightMeter = height / 100;
		
		// float bmi =  weight / (heightMeter * heightMeter);
		float bmi = weight / heightMeter / heightMeter;
		
		String status;
		if(bmi < 18.5f) {
			status = "저체중";
		} else if(bmi < 23f) {
			status = "정상";
		} else if(bmi < 25f) {
			status = "과체중";
		} else if(bmi < 30f) {
			status = "경도비만";
		} else {
			status = "중등도비만";
		}
		
		//출력
		System.out.println("bmi수치는 " + bmi + "입니다.");
		System.out.println("건강 상태: " + status);
	}
}
