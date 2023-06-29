package array;

import java.util.Random;

public class Test14_1 {

	public static void main(String[] args) {
		// 데이터 준비
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		Random r = new Random();
		
		for(int i = 0; i < data.length; i++) {
			//셔플(뒤섞기)
			//- 같은 자리 제거
			//- 같은 자리가 나오면 다시 뽑아라 / 같은 자리가 나오면 하던 작업을(지금 하는 턴을) 무효화시켜라
			//[i] <----> [0~4]
		int index = r.nextInt(data.length);
		
		if(i == index) {
			i--;
			//continue 를 쓰거나 else문을 쓴다 
		} else {
		int backup = data[i];
			data[i] = data[index];
			data[index] = backup;
			}
		}
		//출력
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}

}
