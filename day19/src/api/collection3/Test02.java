package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Map<String, String> a = new HashMap<>();
		a.put("admin", "admin1234");
		a.put("teacher", "teacher1234");
		a.put("student", "student1234");
		a.put("manager", "manager1234");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String inputId = sc.next();
		System.out.print("비밀번호 입력: ");
		String inputPw = sc.next();
	
		sc.close();
		
		if (a.containsKey(inputId) && inputPw.equals(a.get(inputId)) ) {
			System.out.print("로그인 성공");
		}
		else {
			System.out.print("로그인 실패");
		}
	}
}
