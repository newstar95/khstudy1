package condition;

import java.util.Scanner;

public class Test05_2 {

	public static void main(String[] args) {
		//과속 단속 카메라 프로그램
		//50km 초과 단속 
		//50km보다 10km 이상 넘을 때마다 10000원씩 증가
		//입력값은 자동차 속도
		//예상되는 값을 출력
		Scanner sc = new Scanner(System.in);
		
		//입력 
		System.out.print("속도를 입력하세요(km): ");
		int speed = sc.nextInt();
		
		sc.close();
		int limit = 50;
		
		//계산
		boolean over = speed > 50;
		int overSpeed = speed - limit;
		int base = 30000;
		int add = 10000;
		int fine; // = 0 또는 어쩌구 저쩌구
		
		//출력
		if(over) {
			fine = 30000 + overSpeed / 10 * 10000; // 이런 식 굉장히 많이 쓰임
			
		} else {
			fine = 0;
		}
		System.out.println("벌금: " + fine + "원");
	}
}