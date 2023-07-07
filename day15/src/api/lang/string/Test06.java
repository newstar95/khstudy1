package api.lang.string;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String start = "바나나";
		
			while (true) {
				System.out.println("제시어: " + start);
				System.out.println("입력: ");
				String user = sc.next();
				
				if (start.charAt(2) == user.charAt(0) && user.length() == 3) {
					start = user;
				} else {
					System.out.println("게임 오버");
					break;
					}
						
				}
			
			sc.close();
			
			}
			
		} 
		


