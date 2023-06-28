package array;

import java.util.Random;

public class Test09_2 {

	public static void main(String[] args) {
		//주사위를 1000번 던졌을 때 1이 나온 횟수가 측정하기
		
		Random r = new Random();
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i < 1000; i++) {
			int dice = r.nextInt(6) + 1;
			
			if(dice == 1) {
//				System.out.println("1 나왔어요!");
				count1++;
			} else if(dice == 2) {
				count2++;
			}
		}
		System.out.println("1이 나온 횟수 = " + count1);
		System.out.println("2가 나온 횟수 = " + count2);
	}
}
