package condition3;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		
		System.out.print("년도 입력: " );
		int year = sc.nextInt();
		sc.close();
		
		//계산
		//윤년 계산
		boolean year4 = year % 4 == 0;
		boolean year100 = year % 100 != 0;
		boolean year400 = year % 400 == 0;
		boolean isYear = year400 || year4 && year100; 
		
		String s;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		s = "31일";
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		s = "30일";
		break;
		default:
			if(isYear) {
				s = "29일";
			} else {
				s = "28일";
			}
		break;
		}
		//출력
		System.out.println(month + "월은(는) " + s + "까지 있습니다.");
	}
}
