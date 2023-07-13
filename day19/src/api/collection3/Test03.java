package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Map<String, Integer> tv = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while (true) {
			
			System.out.print("이름 입력:" );
			String name = sc.next();
			
			if (tv.containsKey(name) == false) {
				tv.put(name, num);
			} 
			else if(name.equals("종료")) {
				break;
			}
			else {
				num++;
				tv.put(name, num);
			}
		}
		System.out.println(tv);
	}

}
