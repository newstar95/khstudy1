package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//이름
		List<String> name = new ArrayList<>();
		//항목
		List<String> item = new ArrayList<>();
		
		//인원수
		System.out.print("인원수: ");
		int people = sc.nextInt();
		
		for(int i = 0; i < people; i++) {
			System.out.print("이름 입력: ");
			String inputName = sc.next();
			name.add(inputName);
		}
		
		for(int i = 0; i < people; i++) {
			System.out.print("항목 입력: ");
			String inputItem = sc.next();
			item.add(inputItem);
			
		}
		
		Collections.shuffle(name);
		Collections.shuffle(item);
		
		for(int i = 0; i < people; i++) {
			System.out.println(i + 1 +  "번째 사다리" );
			System.out.println(name.get(i));
			System.out.println(item.get(i));
		}
		
	}

}
