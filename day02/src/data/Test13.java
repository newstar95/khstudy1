package data;

public class Test13 {

	public static void main(String[] args) {
		// 커피 한 잔의 가격
		int coffeePrice = 2500;
		// 학생 수
		int student = 27;
		// 강사 수
		int teacher = 1;
		// 총 인원 수
		int order = student + teacher;
		
		
		// 무료 처리 없는 주문 금액
		int orderPrice = order * coffeePrice;
		
		// 무료 처리
		int freeCoffee = (order / 5);
		
		// 최종 구매 금액
		int price = (order - freeCoffee) * coffeePrice;
		
		System.out.println(freeCoffee);
		System.out.println(price);
	}
}
