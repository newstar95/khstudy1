package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 사용자에게 랜덤으로 2단부터 9단 사이의 구구단 문제를 10개 출제합니다.
		// 사용자가 입력한 값으로 정답/오답을 판정하고
		// 모든 문제 출제가 끝나면 정답과 오답 개수를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int yes = 0;
		int no = 0;
		
		for (int i = 0; i < 10; i++) { //10개 출력
			int dan = r.nextInt(8) + 2;
			int num = r.nextInt(9) + 1;
			
			int result = dan * num; 
			
			System.out.print(dan + "x" + num + "=");
			int user = sc.nextInt();
			
			if (user == result) {
				System.out.println("정답");
				yes++;
			} else {
				System.out.println("오답");
				no++;
			}
		}
		System.out.println("구구단 10문제 끝!");
		System.out.println("정답 개수: " + yes);
		System.out.println("오답 개수: " + no);
	}

}
