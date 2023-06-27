package loop2;

import java.util.Scanner;

public class Test10_2 {

	public static void main(String[] args) {
		//시간 여러번 입력받기
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
		System.out.print("공부한 시간/분: ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		}
		
		sc.close();
		
	}

}
