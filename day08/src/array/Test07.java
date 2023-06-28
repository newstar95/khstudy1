package array;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 사용자에게 나라이름 5개를 입력받아서 출력하도록 프로그램 구현
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("나라 이름 입력: ");
			names[i] = sc.next();
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(" 입력한 나라: " + names[i]);
		}
		sc.close();
	}
}
