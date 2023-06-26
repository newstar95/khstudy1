package loop2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력: ");
		int number = sc.nextInt();
		int right = 0;
		int wrong = 0;
		int combo = 0;
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(number + "x" + i + "=");
			int answer = sc.nextInt();
			if (answer == number*i) {
				System.out.println("정답입니다.");
				right++;
				combo++;
				System.out.println(combo + " 콤보!");
			} 
			else {
				combo = 0;
				System.out.println("오답입니다.");
				wrong++;
			}
			
		}
		System.out.println("정답개수: " + right);
		System.out.println("오답개수: " + wrong);
		sc.close();
	}
}

