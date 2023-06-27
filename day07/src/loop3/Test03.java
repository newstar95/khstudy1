package loop3;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//사용자에게 숫자를 입력받아 합계와 평균을 구하여 출력하는 프로그램 구현
		//(단, 사용자가 0을 입력할 경우 프로그램을 종료합니다.)
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int hap = 0;
		while(true) {
			System.out.print("숫자 입력: ");
			int user = sc.nextInt();
			
			if (user != 0) {
				count++;
				hap += user;
			} else {
				System.out.println("0을 입력하여 프로그램이 종료됩니다. ");
				break;
			}
		}
		sc.close();
		double average = (double)hap / count;
		System.out.println("합계: " + hap);
		System.out.println("평균: " + average);
	}
}
