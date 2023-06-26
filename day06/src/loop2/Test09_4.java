package loop2;

import java.util.Scanner;

public class Test09_4 {

	public static void main(String[] args) {
		//전체 합계
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자 입력: ");
			int number = sc.nextInt();
			
			total += number;
		}
		sc.close();
		System.out.println("전체 합계= " + total);
	}
}
