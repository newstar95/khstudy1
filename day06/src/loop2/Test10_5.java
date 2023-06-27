package loop2;

import java.util.Scanner;

public class Test10_5 {

	public static void main(String[] args) {
		//합계 구하기
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
		System.out.print("공부한 시간/분: ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		int time = hour * 60 + minute;
		total += time;
		
		}
		
		sc.close();
		
		int hour = total / 60;
		int minute = total % 60;
				
		
		System.out.println("총 공부한 시간은 " + hour + "시간 " + minute + "분 입니다.");
		
		int average = total / 5;
		int averageHour = average / 60;
		int averageMinute = average % 60;
		
		System.out.println("평균 공부한 시간은 약 " + averageHour + "시간 " + averageMinute + "분 입니다." );
	}

}