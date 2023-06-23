package loop;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		for ( int i = 0; i < 5; i++) {
			int num = sc.nextInt();
		}
		sc.close();
	}
}
