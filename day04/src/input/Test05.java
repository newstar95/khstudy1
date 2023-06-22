package input;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("떡볶이 주문 수: ");
		int ddok = sc.nextInt();
		System.out.print("튀김 주문 수: ");
		int to = sc.nextInt();
		System.out.print("순대 주문 수: ");
		int soon = sc.nextInt();
		
		int ddokPrice = 3000;
		int toPrice = 500;
		int soonPrice = 2000;
		
		int rate = 10;
		
		sc.close();
		
		//계산
		int totalPrice =  ddokPrice * ddok + toPrice * to + soonPrice * soon;
		int event = (totalPrice / 100) * rate;
		int eventPrice = totalPrice - event;
		
		//출력
		System.out.println("총 구매 금액: " + totalPrice);
		System.out.println("할인이 포함된 총 가격: " + eventPrice);

	}
}
