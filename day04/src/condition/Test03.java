package condition;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요: ");
		int birth = sc.nextInt(); // 입력 받을 출생년도
		
		int age = 65; //할인 기준 나이
		int bab = 7500; //국밥 가격
		int year = 2023; //올해년도
		
		int discount = bab * 30 / 100; // 할인율
		int pay = bab - discount; // 할인이 적용된 가격
		int event = year - birth + 1; // 이벤트 적용되는 나이
				
		if ( event >= age ) {
			System.out.println("65세 이상이므로 " + bab + "원에서 \n할인율 " + 
		discount + "원이 적용되어 총" + pay + "원이 나왔습니다.");
		} else {
			System.out.println("65세 이상이 아니므로 " + bab + "원이 나왔습니다.");
		}
	}
}
