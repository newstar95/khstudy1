package random;

import java.util.Random;

public class Test04_1 {

	public static void main(String[] args) {
		// 더블 확률
		Random r = new Random();
		
		int count = 0;
		int size = 100;
		
		for(int i = 0; i < size; i++) {
		int dice1 = r.nextInt(6) + 1; //1부터 6개;
		int dice2 = r.nextInt(6) + 1; 
		
		if (dice1 == dice2) {
			System.out.println("주사위 = " + dice1 + " , " + dice2);
			count++;
			}
		
		}
		System.out.println("더블이 나온 횟수= " + count);
//		double percent = (double)개수/크기 * 100;
		double percent = (double)count/size * 100;
		System.out.println("더블이 나온 확률= " + percent + "%");
		//close는 입출력 도구에만 있다.

	}
}
