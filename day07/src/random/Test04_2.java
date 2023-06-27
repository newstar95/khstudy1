package random;

import java.util.Random;

public class Test04_2 {

	public static void main(String[] args) {
		// 만약 더블일 경우 한 턴을 더 던지게 처리하려면?
		//= 반복 횟수를 증가시키려면?
		//= 재추첨
		Random r = new Random();
		
		int count = 0;
		int size = 100;
		int real = 0;
		
		for(int i = 0; i < size; i++) {
			real++;
		int dice1 = r.nextInt(6) + 1; //1부터 6개;
		int dice2 = r.nextInt(6) + 1; 
		
		if (dice1 == dice2) {
			System.out.println("주사위 = " + dice1 + " , " + dice2);
			count++;
			
			//추첨 코드가 아니라 반복문을 1회 증가시키는 코드를 추가
			i--; //반복문에서 반복문 횟수를 늘리는 코드, 재추첨 코드
			
			}
		}
		System.out.println("더블이 나온 횟수= " + count);
//		double percent = (double)개수/크기 * 100;
		double percent = (double)count/size * 100;
		System.out.println("더블이 나온 확률= " + percent + "%");
		System.out.println("실제로 던진 힛수= " + real + "번");
	}
}
