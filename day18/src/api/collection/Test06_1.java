package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> chain = new ArrayList<>();
		chain.add("자바");
		
		String regex = "^[가-힣]{2,6}$";
		
		while (true) {
			String given = chain.get(chain.size()-1); //마지막 기록을 추출
			
			System.out.println("제시어: " + given);
			System.out.print("입력: ");
			String input = sc.next();

			if(input.matches(regex) == false) 
				break;
			if (given.charAt(given.length()-1) != input.charAt(0)) 
				break;
			if(chain.contains(input)) 
				break;
//				System.out.println("통과");
				chain.add(input);
			
		}
			System.out.println("게임 오버!");
			
			System.out.println("기록");
			for(int i = 0; i < chain.size(); i++) {
				String word = chain.get(i);

				System.out.println("-> " + word);
			}
			
	 }

}
