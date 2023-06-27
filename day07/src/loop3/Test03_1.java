package loop3;

import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		// 사용자가 0을 입력할 때까지 입력한 모든 숫자의 합계와 평균을 출력
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while(true) {
			System.out.print("숫자 입력: ");
			int number = sc.nextInt();

			if(number == 0) { //0이면
				System.out.print("0을 만나 탈출");
				break;	
			}	else { //0빼고 나머지
				total += number;
				count++;
			}
		}
		sc.close();
		System.out.println("합계 = " + total);
		System.out.println("횟수 = " + count);
		
		float average = (float)total / count;
		System.out.println("평균 = " + average);
	}
}
