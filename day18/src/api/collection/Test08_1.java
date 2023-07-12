package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test08_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//이름
		List<String> names = new ArrayList<>();
		//항목
		List<String> items = new ArrayList<>();
		
		//인원수
		System.out.print("인원수: ");
		int people = sc.nextInt();
		sc.nextLine(); //엔터 제거
		
		for(int i = 0; i < people; i++) {
			System.out.print("이름 입력: ");
			String inputName = sc.nextLine();
			names.add(inputName);
		}
		
		for(int i = 0; i < people; i++) {
			System.out.print("항목 입력: ");
			String inputItem = sc.nextLine();
			items.add(inputItem);
		}
		
		sc.close();
		
		Collections.shuffle(items);
		
		for(int i = 0; i < people; i++) {
			System.out.println(i + 1 +  "번째 사다리" );
			System.out.println(names.get(i) + " -> " + items.get(i));
		}
		
	}

}
