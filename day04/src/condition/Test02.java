package condition;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//입력
				Scanner sc = new Scanner(System.in);
				
				System.out.print("출생년도(YYYY)를 입력하세요. : ");
				int birth = sc.nextInt();
				
				sc.close();
				
				//계산
				int year = 2023;
				int age = year - birth + 1;
				
				if (age == 19) {
					System.out.println(age + "살 이므로 이벤트 대상입니다.");
				} else {
					System.out.println(age + "살 이므로 이벤트 대상이 아닙니다.");
				}
		}
}

