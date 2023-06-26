package loop;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분 입력: ");
		int min = sc.nextInt();
		System.out.print("초 입력: ");
		int count = sc.nextInt();
		
		int total = min * 60 + count;
		System.out.println(total);
		
		for (int i = 1; i < total; i++) {
			int min2 = total / 60;
			int count2 = total % 60;
			total--;
//			System.out.println(min2 + "분" + count2 + "초" + " 후 알람이 울립니다!");
		}
		System.out.println("알람 시작!");
	}
}
