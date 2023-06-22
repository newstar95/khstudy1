package condition;

import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.print("출생년도 4자리: ");
		int birth = sc.nextInt();
		
		System.out.print("국밥 개수: ");
		int count = sc.nextInt();
		
		int year = 2023;
		int price = 7500;
		
		//계산
		int age = year - birth + 1;
		
		int total = price * count;
//		int discount = 0 또는 30% 금액;
		int discount;
		
		 if(age >= 65) {
			 discount = total * 30 / 100;
		} else {
			discount = 0;
		}
		int result = total - discount;
		
		System.out.println("나이: " + age);
		System.out.println("금액: " + result);
	}
}

