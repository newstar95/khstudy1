package loop2;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// 사용자에게 숫자를 10개 입력받아서 다음을 계산
		// 1. 홀수의 개수
		// 2. 짝수의 개수
		// 3. 전체 합계
		// 4. 전체 평균
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 10개 입력: ");
		
		int num = 0;
		int even = 0;
		int odd = 0;
		int total = 0;
		double avg = 0;
		
		for (int i = 1; i <= 10; i++) {
			num = sc.nextInt();
			if (num % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			total += num;
		}
		avg = total / 10.0;
		System.out.println("짝수 개수: " + even);
		System.out.println("홀수 개수: " + odd);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
	}
}
