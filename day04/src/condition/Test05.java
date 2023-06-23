package condition;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//과속단속 카메라 프로그램
		//50km 초과 단속 
		//50km보다 10km 이상 넘을 때마다 10000원씩 증가
		//입력값은 자동차 속도
		//예상되는 값을 출력
		Scanner sc = new Scanner(System.in);
		
		//입력 
		System.out.print("속도를 입력하세요(km): ");
		int km = sc.nextInt();
		
		sc.close();
		
		//계산
		int price = 30000; //기본키
		int pay; // 증가되는 값
		int plus = km - 50;
		
		if (50 < km) {
			//10km 초과될 때마다 price+10000
			pay = price + plus / 10 * 10000;		
		} else {
			pay = 0;
		}
		//출력
		System.out.println("자동차 속도: " + km + "km");
		System.out.println("초과된 속도: " + plus + "km");
		System.out.println("내야하는 값: " + pay + "원");
	}
}