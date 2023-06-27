package loop3;

import java.util.Scanner;

public class Test05_2 {

	public static void main(String[] args) {
		int number = 100;
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("1~9 입력: ");
			int input = sc.nextInt();
			
			//[방법2] 원치 않는 상황이면 skip 처리
//			if (input < 1 || input > 9) { //1미만 또는 9초과인 경우
			if( !(input >= 1 && input <= 9)) { //1이상 9이하가 아니면 
				System.out.println("1~9만 입력 가능해요");
				continue;
			}
				count++;
		
				number -= input; //차감 처리
				System.out.println("남은 숫자: " + number);
					if (number <= 0) { //남은 숫자가 0이하라면 반복을 중지(게임 오버)
						break;
					} else {
						System.out.println("1~9 사이만 입력하세요");
					}
				}
		sc.close();
		System.out.println("게임 오버!");
		System.out.println("입력 횟수: " + count);
	}
}

