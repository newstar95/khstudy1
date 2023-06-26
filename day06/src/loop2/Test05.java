package loop2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력: ");
		int number = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(number + "x" + i + "=");
			int answer = sc.nextInt();
			if (answer == number*i) {
				System.out.println(answer);
				System.out.println("정답입니다.");
				count1++;
			} else {
				System.out.println(answer);
				System.out.println("오답입니다.");
				count2++;
			}
		}
		System.out.println("정답개수: " + count1);
		System.out.println("오답개수: " + count2);
	}
}
