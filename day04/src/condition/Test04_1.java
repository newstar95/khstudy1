package condition;

import java.util.Scanner;

public class Test04_1 {

	public static void main(String[] args) {
		//여행사 프로모션 2

				//입력
				Scanner sc = new Scanner(System.in);

				System.out.print("인원수 : ");
				int people = sc.nextInt();

				System.out.print("기간(일) : ");
				int days = sc.nextInt();

				System.out.print("예정 월 : ");
				int month = sc.nextInt();

				sc.close();

				//계산
				int price = 100000 * people * days;
				boolean summer = month == 6 || month == 7 || month == 8;
				//int discount = 0 또는 25%금액;
				int discount;
				if(summer) {
					discount = price * 25 / 100;
				}
				else {
					discount = 0;
				}

				int result = price - discount;


				//출력
				System.out.println("정상가 = " + price + "원");
				System.out.println("할인금액 = " + discount +"원");
				System.out.println("판매가 = " + result + "원");
			
		
	}
}
