package loop2;

import java.util.Scanner;

public class Test09_1 {

	public static void main(String[] args) {
		//1번 입력
				Scanner sc = new Scanner(System.in);
				
				for (int i = 0; i < 10; i++) {
					System.out.println("숫자 입력: ");
					int number = sc.nextInt();
				}
				sc.close();
			}
		}
