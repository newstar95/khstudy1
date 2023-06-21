package data;

public class Test13 {

	public static void main(String[] args) {
		// 커피 한 잔의 가격 (5+1로 풀이)
		int coffeePrice = 2500;
		// 주문 갯수
		int cup = 28;
		
		// 무료 처리
		int freeCoffee = (cup / 6);
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
