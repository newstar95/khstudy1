package condition2;

import java.util.Scanner;

public class Test04_1 {

	public static void main(String[] args) {
		//여행사 프로모션3
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("인원 수: ");
		int people = sc.nextInt();
		
		System.out.print("여행 기간(일): ");
		int days = sc.nextInt();
		
		System.out.print("여행 예정 월: ");
		int month = sc.nextInt();
		
		sc.close();
		
		//계산 
		int total = 100000 * people * days;
		int rate;
		
		if(month == 3 || month == 4 || month == 5) { //봄
			rate = 20;
		} else if(month == 6 || month == 7 || month == 8) { //여름
			rate = 10;
		} else if (month == 9 || month == 10 || month == 11) { //가을
			rate = 30;
		} else { //겨울
			rate = 5;
		}
		
		int discount = total * rate / 100; //할인금액
		int result = total - discount; //최종경비
		
		//출력
		System.out.println("총 금액: " + total + "원");
		System.out.println("할인율: " + rate + "%");
		System.out.println("할인 금액: " + discount + "원");
		System.out.println("최종 금액: " + result + "원");
		
		
	}
}
