package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		
		Random r = new Random();
		
		for(int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;
			if (a.contains(num)) {
				i--;
			} else {
			a.add(num);
			num = 0;
			}
		}
		System.out.println(a);

	}

}
