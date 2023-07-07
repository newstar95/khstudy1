package api.lang.string2;

import java.util.Scanner;

public class Test05_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일 입력(yyyy-mm-dd)");
		String user = sc.nextLine();
		
		sc.close();
		
		String regex=
				"^([1][9][0-9][0-9]|[2][0-9][0-9][0-9])\\-(0[1-9]|[1][012])\\-([0][1-9]|[12][1-9]|[3][01])$";
				
		
		boolean isValid = user.matches(regex);
		
		if(isValid) {
			System.out.println("올바른 생년월일입니다.");
		} else {
			System.out.println("잘못된 생년월일입니다.");
		}
		
	}

}
