package api.lang.string;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] list = new String[] {"수박씨", "신발끈", "개나리","십장생","시베리아",
				"주옥", "조카", "게불", "10원"};
		
		System.out.print("입력: ");
		String user = sc.nextLine();
		
		sc.close();
		
		for (int i = 0; i < list.length; i++) {
			if(user.contains(list[i])) {
				user = user.replace(user,"*****" );
			} 
		}
		System.out.println("user: " + user);
	}

}
