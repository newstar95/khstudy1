package array;

import java.util.Random;

public class Test09_4 {

	public static void main(String[] args) {
		//로또 
		Random r = new Random();
		
		int[] countList = new int[45]; //세어야 하는 숫자의 갯수가 45가지여서
		
		for(int i = 0; i < 1000; i++) {
			int lotto = r.nextInt(45) + 1; //로또 숫자가 1부터 45여서
			countList[lotto-1]++; // 만약 숫자가 2가 나오면 2번 위치 + 1을 해야하기 때문에
		}
		
		for (int i = 0; i < countList.length; i++) {
			System.out.println((i + 1) + " 나온 횟수 = " + countList[i]);
		}
	}
}
