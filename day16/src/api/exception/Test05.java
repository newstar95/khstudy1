package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// Test04에서 자바가 감지하지 못하는 예외를 개발자가 수동으로 처리
		// -> 강제 예외 처리
		
		try { //플랜A
			Scanner sc = new Scanner(System.in);
			System.out.println("금액: ");
			int money = sc.nextInt();
			
			if(money < 0) { //자바가 인지하지 못하는 문제 상황
				Exception ex = new Exception();
//				throw ex; //throw를 이용하면 실행을 중지하고 catch블록으로 이동
				throw new Exception("금액이 음수일 수 없습니다.");
			}
			
			System.out.println("인원: ");
			int people = sc.nextInt();
			if(people < 0) { //자바가 인지하지 못하는 문제 상황
				throw new Exception();
			}
		
			sc.close();
			
			int price = money / people; //1인당 정산금액
			int remain = money % people; //자투리 금액
			
			System.out.println("1인당 내야할 금액은 " + price + "원 입니다.");
			System.out.println(remain + "원은 저희가 지원해 드려요!");

		} 
		catch (Exception e) { //예외의 아버지 (필살기 클래스)
//			System.err.println("프로그램 오류 발생");
			//합쳐놓고 보니 자세한 정보가 그립더라 (예외 객체 활용)
			
//			System.out.println(e);
//			System.out.println(e instanceof ArithmeticException);
			
			//에외 객체의 설정된 메세지가 있다면 출력할 수 있다.
			if(e.getMessage() == null) {
				System.err.println("오류 발생");
			} else {
			System.err.println(e.getMessage());
			}
		} 
		
	}

}
