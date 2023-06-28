package array;

import java.util.Scanner;

public class Test08_3 {

	public static void main(String[] args) {
		// 등수 구하기
		// 등수는 카운트이다. (나보다 점수가 높은 사람이 몇 명있나를 세는 것)
		
		int[] scores = new int[5];
		// int[] scores = new int[] (0,0,0,0,0); 입력 받는게 아니라 값을 먼저 채워넣을 때 편함
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("점수: ");
			scores[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > 75) {
				count++;
			}
		}
		System.out.println(count);
		
		int rank = count + 1;
		System.out.println("예상 등수 = " + rank); //n명이 75점을 받은 너보다 잘하니까 
		
		
//		System.out.println("재평가자 점수는 다음과 같습니다.");
//		for(int i = 0; i < scores.length; i++) {
//			
//			if(scores[i] < 60) {
//				System.out.println("재평가자 점수 = " + scores[i]);
//				}
//		}
//		
//		System.out.println("성적우수자 점수는 다음과 같습니다.");
//		for(int i = 0; i < scores.length; i++) {
//			if(scores[i] >= 90) {
//				System.out.println("성적우수자 점수 = " + scores[i]);
//			}
//		}
		sc.close();
	}
}
