package api.lang.string;

import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		//쿵쿵따 게임 1턴 구현
		Scanner sc = new Scanner(System.in);

		String given = "바나나";

		while(true) {
			System.out.println(given + "! 쿵쿵따!");

			String input = sc.next();

			//판정
			//[1] 3글자인지 판정
			//[2] 이어지는지 판정
			boolean condition1 = input.length() == 3;
			boolean condition2 = given.charAt(2) == input.charAt(0);
			if(condition1 && condition2) {
				System.out.println("합격!");
				given = input;//제시어 교체
			}
			else {
				System.out.println("게임오버!");
				break;
			}
		}

		sc.close();
	}
}

