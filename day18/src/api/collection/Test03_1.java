package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		//입력 도구 생성
		Scanner sc = new Scanner(System.in);
		
		//저장소 생성
		ArrayList<String> a = new ArrayList<>();
		
		while(true) {
			//사용자 입력
			System.out.print("나라 이름: " );
			String input = sc.next();
			
			if(a.contains(input)){
				break;
			} else {
				a.add(input);
			}
		}
		sc.close();
		System.out.println("게임오버");
		System.out.println(a.size() + "개");
		
	}

}
