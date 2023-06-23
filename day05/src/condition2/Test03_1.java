package condition2;

import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("나이 입력: ");
		int age = 25;
		int card = 500;
		
		//어린이를 밑에 두면 마지막 else 문은 실행이 되지 않는다.
		//그래서 제일 걸리기 힘든 것을 밑에 둬야 한다.
		
		//계산 - 이용 요금을 계산
		int price;
		
		//성인이 맨 위에 있었으면 이 코드가 실행되지 않았을 것
		if(age >= 65 || age < 9) {
			price = 0;
		} else if ( age >= 20 ) { //성인
			price = 1250;
		}  else if ( age >= 14 ) { //청소년
			price = 720;
		}  else {						//어린이
			price = 450;
		}
		
		int result = price + card;
		
		//출력 
		System.out.println("기본 요금: " + price + "원");
		System.out.println("카드 보증금: " + card + "원");
		System.out.println("이용 요금: " + result + "원");
	}
}
