package api.exception;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일(YYYY-MM-DD) 입력: ");
		String birth = sc.nextLine();
		
		sc.close();
		
			try { //플랜 A
				String year = birth.substring(0,4);
				String month = birth.substring(5,7);
				String date = birth.substring(8,10);
				
//				int part1 = Integer.parseInt(year);
//				int part2 = Integer.parseInt(month);
//				int part3 = Integer.parseInt(date);
				
				System.out.println("출생년도: " + Integer.valueOf(year));
				System.out.println("출생월: " + Integer.valueOf(month));
				System.out.println("출생일: " + Integer.valueOf(date));
			} catch (IndexOutOfBoundsException e) {
				//플랜B - 입력 길이가 짧을 때
				System.err.println("입력값이 너무 짧습니다.");
			} catch (NumberFormatException e) { 
				//플랜B - 숫자 변환이 안될 때
				System.err.println("올바른 숫자가 입력되지 않았습니다..");
			}

	}

}
