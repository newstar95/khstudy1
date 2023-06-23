package condition2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("정거장 수: ");
		int subNum = sc.nextInt();
		
		sc.close();
		//계산
		int card = 500;
		int price; 
		
		if (age < 8) {
			price = 0;
		} else if (age >= 8 && age < 14) {
			price = 450;
		} else if (age >= 14 && age < 20) {
			price = 720; 
		} else if (age >= 20 && age < 65) {
			price = 1250; 
		} else {
			price = 0;
		}
		int num = card + price;
		
		//출력
		System.out.println("카드 보증금: " + card + "원");
		System.out.println("총 이용 요금: " + num  + "원");
	}
}
