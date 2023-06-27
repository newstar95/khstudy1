package loop2;

import java.util.Scanner;

public class Test10_3 {

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
		
		System.out.println("total = " + total);
	}

}
