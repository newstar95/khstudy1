package array;

import java.util.Scanner;

public class Test08_2 {

	public static void main(String[] args) {
		// 배열에 5개의 정수 데이터를 입력
		
		int[] scores = new int[5];
		// int[] scores = new int[] (0,0,0,0,0); 입력 받는게 아니라 값을 먼저 채워넣을 때 편함
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("점수: ");
			scores[i] = sc.nextInt();
		}
		
		System.out.println("재평가자 점수는 다음과 같습니다.");
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] < 60) {
				System.out.println("재평가자 점수 = " + scores[i]);
				}
		}
		
		System.out.println("성적우수자 점수는 다음과 같습니다.");
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 90) {
				System.out.println("성적우수자 점수 = " + scores[i]);
			}
		}
		sc.close();
	}
}
