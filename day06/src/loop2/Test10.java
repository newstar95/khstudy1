package loop2;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		//사용자에게 이번주 월요일부터 금요일까지 공부한 시간을 입력받습니다.
		//입력된 정보를 토대로 다음을 계산하여 출력
		//1. 총 공부한 시간
		//2. 일 평균 공부한 시간
		//입력은 '시간'과 '분'을 따로 받으며, 출력도 '시간'과 '분'은 따로 받는다.
		
		int total = 0; //총 공부한 시간
		int avg = 0; //일 평균 공부한 시간
		
		int userHour = 0;
		int userMin = 0;
		
		int totalHour = 0;
		int totalMin = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("공부한 시간(시간): ");
			userHour = sc.nextInt();
			System.out.print("공부한 시간(분): ");
			userMin = sc.nextInt();
			
			totalHour += userHour;
			totalMin += userMin;
		}
			int minHour = (totalHour * 60);
			total = minHour + totalMin;
		
		int resultHour = total / 60;
		int resultMin = total % 60;
//		sc.close();
		System.out.println("총 공부한 시간 =" + resultHour + "시간" + resultMin + "분");
////		System.out.println("일 평균 약 =" + "시간" + "분");
	}
}
