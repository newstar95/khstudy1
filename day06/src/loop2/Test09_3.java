package loop2;

import java.util.Scanner;

public class Test09_3 {

	public static void main(String[] args) {
		//짝수의 개수
				Scanner sc = new Scanner(System.in);
				
				int even = 0;
				
				for (int i = 0; i < 10; i++) {
					System.out.println("숫자 입력: ");
					int number = sc.nextInt();
					
					if(number % 2 == 0) {
						even++;
					}
				}
				sc.close();
				System.out.println("짝수의 개수= " + even);
			}
		}
