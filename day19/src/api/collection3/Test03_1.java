package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		Map<String, Integer> tv = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("이름 입력:" );
			String name = sc.next();
			
			if (name.equals("종료")) {
				break;
			} 
			if (tv.containsKey(name)) { //이름이 있으면
				int count = tv.get(name); //이름에 해당하는 득표수 추출
				count++;
				tv.put(name, count);
				System.out.println(name + " 현재 " + (count++) + "표");
			} else { //이름이 없으면
				int count = 1;
				tv.put(name, count);
				System.out.println(name + " 현재 " + 1 + "표");
			}
		}
		sc.close();
		System.out.println(tv);
	}

}
