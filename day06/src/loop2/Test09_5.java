package loop2;

import java.util.Scanner;

public class Test09_5 {

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
		
		double average = (double)total / 10;
		System.out.println("전체 합계= " + average);
	}
}
