package loop2;

import java.util.Scanner;

public class Test09_2 {

	public static void main(String[] args) {
		//홀수의 개수
		Scanner sc = new Scanner(System.in);
		
		int odd = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자 입력: ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				odd++;
			}
		}
		sc.close();
		System.out.println("홀수의 개수= " + odd);
	}
}

