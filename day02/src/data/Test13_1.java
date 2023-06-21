package data;

public class Test13_1 {

	public static void main(String[] args) {
		// 커피 한 잔의 가격 (5+1로 풀이)
		int coffeePrice = 2500;
		// 주문 갯수
		int cup = 28;
		// 몇 개 살 때 플러스 되는 지
		int event = 5;
		
		// 무료 처리
		int freeCoffee = cup / (event + 1);
//		int pay = cup - freeCoffee; // 유료 처리 구매 갯수
		
		// 무료 처리 없는 주문 금액
		int orderPrice = cup * coffeePrice;
//		int total = coffeePrice * pay; 

		
		// 최종 구매 금액
		int price = (cup - freeCoffee) * coffeePrice;
		
		System.out.println(freeCoffee);
		System.out.println(price);
	}
}
