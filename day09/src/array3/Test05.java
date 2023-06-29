package array3;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
		// 주사위를 5번씩 6회 던진 결과를 저장한 뒤
		// (1) 회차별 주사위 던진 결과를 출력하시고
		// (2) 모든 주사위 값의 평균을 출력하세요.
		
		int[][] dice = new int[6][5];
		
		Random r = new Random();
		
		int total = 0;
		
		int average = 0;
		
		for(int i = 0; i < dice.length; i++) {
			for(int k = 0; k < dice[i].length; k++) {
				int diceNum = r.nextInt(6)+1;
				dice[i][k] = diceNum;
			}
			
		}
		
		for(int i = 0; i < dice.length; i++) {
			for(int k = 0; k < dice[i].length; k++) {
				total += i;
				total += k;
				average = total /  (dice.length *  dice[i].length);
			}
				
		}
		
		
		//출력
		for(int i = 0; i < dice.length; i++) {
			for(int  k = 0; k < dice[i].length; k++) {
				System.out.print(dice[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println(total);
		System.out.println(average);
		
	}

}
