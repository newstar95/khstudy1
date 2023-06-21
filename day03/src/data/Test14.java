package data;

public class Test14 {
	public static void main(String[] args) {
		//할인 금액 구하기
		//(Q) 300만원짜리 컴퓨터를 20% 할인하면 얼마인가?
		//머리를 쓰면 3000000 * 0.8로 계산 - 이렇게 하면 x
		
		//입력
		int price = 3000000;
		int rate = 20;
		
		//계산
		//주의사항 - 나누기를 먼저하면 손실이 발생할 수 있다.
		int discount = price * rate / 100;
//		int discount = price / 100 * rate; // 나누기를 먼저 하면 할인 금액이 나오지 않음
		int pay = price - discount;
		
		//출력
		System.out.println(discount);
		System.out.println(pay);
		

	}
}
