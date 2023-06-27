package random;

import java.util.Random;
import java.util.Scanner;

public class Test05_2 {

	public static void main(String[] args) {
		// 랜덤 구구단 1문제 출제, 정답 입력 및 판정 추가, 10회 반복, 정답, 오답 카운트 측정
		//(추가) 3번 틀리면 게임을 종료하도록 구현
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int correct = 0, incorrect = 0;
		
		for(int i = 0; i < 10; i++) {
			int a = r.nextInt(8) + 2; //2부터 9개
			int b = r.nextInt(9) + 1; //1부터 9개
			System.out.print(a + "x" + b + "=");
	
			int user = sc.nextInt();
			
			if(a*b == user) {
//				System.out.println("정답");
				correct++;
			} else {
//				System.out.println("오답");
				incorrect++;
				
				if(incorrect == 3) {
					break; //탈출(가장 가까운 반복/switch/try 탈출)
				}
			}
		}
		sc.close();
		System.out.println("게임 끝!");
		System.out.println("총 " + correct + " 문제 맞추셨습니다.");
		System.out.println("틀린 개수는 " + incorrect + " 개 입니다.");
	}
	
}
