package input;

public class Test05_1 {

	public static void main(String[] args) {
		//분식점 금액 계산기
		
		//입력
		int menu1Price = 3000;
		int menu2Price = 500;
		int menu3Price = 2000;
		
		int menu1Count = 2;
		int menu2Count = 0;
		int menu3Count = 1;
		
		int rate = 10;
		
		//계산
		int menu1Total = menu1Price * menu1Count;
		int menu2Total = menu2Price * menu2Count;
		int menu3Total = menu3Price * menu3Count;
		
		int total = menu1Total + menu2Total + menu3Total;
		
		int discount = total;
		
		
		//출력
		System.out.println("결제 금액" + total + "원");
		

	}
}
