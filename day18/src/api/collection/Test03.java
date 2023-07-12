package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		
		while(true) {
			System.out.print("나라 이름: " );
			String input = sc.next();
			
			if(a.contains(input)){
				break;
			} else {
				a.add(input);
			}
		}
		System.out.println("게임오버");
		System.out.println(a.size() + "개");
		
	}

}
