package api.lang.string2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//자리별로 쪼개야함
		//^[1-9][0-9]$ //두자리 정수
		//^(0[1-9]|1[012])$ //월
		
		//사용자에게 생년월일을 입력받아 검사 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일 입력(yyyy-mm-dd)");
		String user = sc.nextLine();
		
		sc.close();
		
		String regex1 =
				"^([1][9][0-9][0-9]|[2][0-9][0-9][0-9])\\-(0[13578]|[10]|[12])\\-([0][1-9]|[12][1-9]|[3][01])$";
				
		String regex2 = 
				"^([1][9][0-9][0-9]|[2][0-9][0-9][0-9])\\-(0[469]|1[1])\\-([0][1-9]|[12][1-9]|[3][0])$";
		
		String regex3 = 
				"^([1][9][0-9][0-9]|[2][0-9][0-9][0-9])\\-[0][2]\\-([0][1-9]|[12][1-9])$";
		boolean isValid1 = user.matches(regex1);
		boolean isValid2 = user.matches(regex2);
		boolean isValid3 = user.matches(regex3);
		
		if(isValid1 || isValid2 || isValid3) {
			System.out.println("올바른 생년월일입니다.");
		} else {
			System.out.println("잘못된 생년월일입니다.");
		}
		
	}

}
