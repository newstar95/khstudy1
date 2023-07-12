package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04_1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		
		Random r = new Random();
		
		while(a.size() < 6) {
			int number = r.nextInt(45) + 1;
			if( !a.contains(number) ) {
				a.add(number);
			}
		}
		
		System.out.println(a);

	}

}
