package condition;

import java.util.Scanner;

public class Test05_1 {

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
		
		//계산
		boolean over = speed > 50;
		
		//출력
		if(over) {
			System.out.println("과속");
		} else {
			System.out.println("정상");
		}
	}
}