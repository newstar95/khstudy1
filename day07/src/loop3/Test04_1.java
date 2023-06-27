package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04_1 {

	public static void main(String[] args) {
		//정답을 생성하고
		Random r = new Random();
		int answer = r.nextInt(1000) + 1;
//		System.out.println(answer);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 1000 사이의 숫자 중 하나를 컴퓨터가 골랐습니다!");
		
		int round = 0;
		//입력하여 맞춘다.
		while(true) {
			System.out.print("입력: ");
			int input = sc.nextInt();
			round++;
			
			if (input == answer) {
				System.out.println("정답!");
				break;
			} else if(input > answer) {
				System.out.println("다운!");
			} else {
				System.out.println("업!");
			}
			
		}
		sc.close();
		System.out.println("총 입력한 횟수는 " + round + "번 입니다.");
	}
}
