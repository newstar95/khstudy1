package array;

import java.util.Scanner;

public class Test08_1 {

	public static void main(String[] args) {
		// 배열에 5개의 정수 데이터를 입력
		
		int[] scores = new int[5];
		// int[] scores = new int[] (0,0,0,0,0); 입력 받는게 아니라 값을 먼저 채워넣을 때 편함
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("점수: ");
			scores[i] = sc.nextInt();
		}
		sc.close();
	}

}
