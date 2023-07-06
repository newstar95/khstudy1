package api.lang.string;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력: ");
		String userId = sc.next();
		System.out.print("password 입력: ");
		String userPw = sc.next();
		
		String id = "khacademy";
		String pw = "student1234";
		
		
		sc.close();
		
		if(userId.equalsIgnoreCase(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		} else { System.out.println("로그인 실패");
		}
		
		//계산 - 대문자/소문자 변환하여 비교
		if(userId.toLowerCase().equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		} else { System.out.println("로그인 실패");
		}

	}

}
