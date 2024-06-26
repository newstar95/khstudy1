package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Map<String, Integer> tv = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("이름 입력:" );
			String name = sc.next();
			
			if (name.equals("종료")) {
				break;
			} 
			
			if (tv.containsKey(name)) {
				int num = tv.get(name);
				tv.put(name, num+1);
				System.out.println(name + " 현재 " + (num+1) + "표");
			} else {
				tv.put(name, 1);
				System.out.println(name + " 현재 " + 1 + "표");
			}
	
		}
		sc.close();
		System.out.println(tv);
	}

}
