package loop3;

import java.util.Scanner;

public class Test05_1 {

	public static void main(String[] args) {
		int number = 100;
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("1~9 입력: ");
			int input = sc.nextInt();
			
			//[방법1] 
			
				if (input >= 1 && input <= 9) {
				count++;
		
				number -= input; //차감 처리
				System.out.println("남은 숫자: " + number);
				
					if (number <= 0) { //남은 숫자가 0이하라면 반복을 중지(게임 오버)
						break;
					} else {
						System.out.println("1~9 사이만 입력하세요");
					}
				}
		}
		sc.close();
		System.out.println("게임 오버!");
		System.out.println("입력 횟수: " + count);
	}
}
