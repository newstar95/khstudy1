package loop;

import java.util.Scanner;

public class Test07_1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.print("분 입력: ");
		int minute = sc.nextInt();
		System.out.print("초 입력: ");
		int second = sc.nextInt();
		
		//계산
		int time = minute * 60 + second;
		
		//출력
		for(int i = time; i >= 0; i--) {
			int min = i / 60;
			int sec = i % 60;
			System.out.println(min + "분" + sec + "초" + " 후 알람이 울립니다!");
			
			//1초 대기
			if (i > 0) {
				Thread.sleep(1000);
			}
		}
		System.out.println("알람 시작!");
	}
}
