package condition2;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//여행사 세 번째 프로모션
		//1인 1박 10만원
		
		//사용자에게 필요한 정보: 인원, 여행기간, 여행 일자
		
		//사용자에게 받을 입력 정보
		Scanner sc = new Scanner(System.in);
		//인원 수
		System.out.print("인원 수: ");
		int people = sc.nextInt();
		//여행일자
		System.out.print("여행 일자: ");
		int day = sc.nextInt();
		//여행예정 월
		System.out.print("여행예정 월: ");
		int month = sc.nextInt();
		
		//계산
		//가격
		int price = 100000; 
		int total = people * day * price; //총 금액
		int rate; //할인이 얼마나 되는지
		int discountt;
		
		if (month >= 3 || month <= 5  ) {
			rate = 20;
		} else if (month <= 8 ) {
			rate = 10;
		} else if (month <= 11  ) {
			rate = 30;
		} else {
			rate = 5;
		}
		
		int discount = total * rate / 100; //할인 금액
		int result = total - rate; //할인율에서 총 가격을 뺀 최종 금액

		//출력
		System.out.println("총 금액: " + total + "원");
		System.out.println("할인 금액: " + discount + "%");
		System.out.println("최종 금액: " + result + "원");
	}
}
