package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		예외를 처리하다보니 발생하는 문제점들을 추가적으로 해결
//		[1] 예외 처리 하기 전 메세지(stack trace)를 보고 싶어요
//			-> e.printStackTrace();
//			-> 개발 완료 후 삭제하거나 다른 코드로 치환(ctrl+h)
//		[2] 예외 처리 중 발생하는 경고를 없애고 싶어요
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("금액: ");
			int money = sc.nextInt();
			
			if(money < 0) { 
				Exception ex = new Exception();
				throw new Exception("금액이 음수일 수 없습니다.");
			}
			
			System.out.println("인원: ");
			int people = sc.nextInt();
			if(people < 0) { 
				throw new Exception();
			}
		
			sc.close();
			
			int price = money / people; 
			int remain = money % people; 
			
			System.out.println("1인당 내야할 금액은 " + price + "원 입니다.");
			System.out.println(remain + "원은 저희가 지원해 드려요!");

		} 
		catch (Exception e) {
			e.printStackTrace(); //예외처리 안 한 것처럼 스택 추적 결과를 출력
		} 
		
	}

}
