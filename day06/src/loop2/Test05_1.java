package loop2;

import java.util.Scanner;

public class Test05_1 {

	public static void main(String[] args) {
		// for를 쓰려면 횟수 or 범위를 알아야한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단: ");
		int dan = sc.nextInt();
		
		int ok = 0;
		int nok = 0;
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + "x" + i + "=");
			int user = sc.nextInt();
			
			if(dan * i == user) {
				System.out.println("정답");
				ok++;
			} 
			else {
				System.out.println("오답");
				nok++;
			}
		}
		sc.close();
		System.out.println("맞은 개수 = " + ok);
		System.out.println("맞은 개수 = " + nok);
	}
}
