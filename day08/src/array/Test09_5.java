package array;

import java.util.Random;

public class Test09_5 {

	public static void main(String[] args) {
		//로또 
		Random r = new Random();
		
		int[] countList = new int[45]; //(=카운트를 세는 배열), 세어야 하는 숫자의 갯수가 45가지여서
			
		
		for(int i = 0; i < 1000; i++) { //숫자를 뽑는 게 1000번이니까
			int lotto = r.nextInt(45) + 1; //로또 숫자가 1부터 45까지 있어서
			countList[lotto-1]++; //countList는 0부터 44까지 있는데 lotto는 1부터 45까지 있기 때문에
												//lotto-1을 해서 countList 숫자와 lotto 숫자를 일치하게 하는 것
												//그래서 맞는 자리에 ++;을 하게 된다.
		}
		
		for (int i = 0; i < countList.length; i++) {
			System.out.println((i + 1) + " 나온 횟수 = " + countList[i]); 
			//i는 0부터 시작하니까 1을 가져오기 위해 +1을 하고
			//countList의 1번을 가져오기 위해 [i]를 인덱스 번호로 설정한다.
		}
	}
}
