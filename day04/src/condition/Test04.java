package condition;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//<입력>
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 입력 받을
		//여행 가는 달
		System.out.print("월을 적으세요: ");
		int month = sc.nextInt();  
		//여행 인원 수
		System.out.print("인원을 적으세요: ");
		int people = sc.nextInt(); 
		//여행 기간
		System.out.print("몇 박인지 적으세요: ");
		int day = sc.nextInt(); 
		
		sc.close();
		
		//1박 가격
		int money = 100000;
		//할인율
		int discount = 25;
		//할인율이 적용될 변수
		int event;
		//할인율이 적용되지 않은 총 가격
		int pay = people * day * money;
		
		//조건은 6,7,8월은 25퍼 할인 그 외에는 정가
		//3,4,5 봄 / 여름 6,7,8 / 가을 9,10,11 / 겨울 12,13,14 
	
		//<계산>
		if (5 < month && month < 9 ) {
			event = pay * discount / 100;
		} else {
			event = 0;
		}
		int result = pay - event;
		
		//<출력>
		System.out.println("===========================");
		System.out.println("여행 가는 달: " + month + "월");
		System.out.println("여행 인원 수: " + people + "명");
		System.out.println("여행 기간: " + day + "박");
		System.out.println("원래 가격: " + pay + "원");
		System.out.println("할인 가격: " + event + "원" );
		System.out.println("총 가격: " + result + "원");

	}
}
