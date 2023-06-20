package data;

public class Test12 {

	public static void main(String[] args) {
		
		//김밥 한 개의 가격
		int gimbapPrice = 1400;
		
		//김밥 구매 갯수
		int buy = 1;
		
		int freeCount = buy / 2; 		
		int price = (buy - freeCount) * gimbapPrice;
				
		System.out.println(freeCount);
		System.out.println(price);
	}
}
