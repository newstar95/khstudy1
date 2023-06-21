package data;

public class Test15 {

	public static void main(String[] args) {
		//입력
		
		//한 사람당 1박 가격
		int price = 100000;
		//할인율
		int event = 25;
		//여행기간
		int day = 7;
		//인원
		int adult = 3;
		
		//계산
		int allPrice = adult * price * day;
		int discount = allPrice * event / 100;
		int pay = allPrice - discount;
		
		//출력
		System.out.println(allPrice);
		System.out.println(discount);
		System.out.println(pay);
		
	}
}
