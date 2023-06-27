package random;

import java.util.Random;

public class Test03_3 {

	public static void main(String[] args) {
		// 윷놀이에서만 가능한 방법
		//- 윷이 4개이고 윷 한 개당 경우의 수가 2가지(앞/뒤)
		//(약속) 등-0, 배-1
		Random r = new Random();
		
		int a = r.nextInt(2); // 0 or 1
		int b = r.nextInt(2); // 0 or 1
		int c = r.nextInt(2); // 0 or 1
		int d = r.nextInt(2); // 0 or 1
		int total = a + b + c + d; //뒤집힌 갯수
		
		switch(total) {
		case 0: //뒤집힌 갯수가 0이라면 모
			System.out.println("모"); break;
		case 1: //뒤집힌 갯수가 1이라면 도/빽도
			if (a == 1) {
				System.out.println("빽도"); break;
			} else {
				System.out.println("도"); break;
			}
		case 2: //뒤집힌 갯수가 2라면 개
			System.out.println("개"); break;
		case 3: //뒤집힌 개수가 3이라면 걸
			System.out.println("걸"); break;
		case 4: //뒤집힌 개수가 4라면 윷
			System.out.println("윷"); break;
		
//		경우의 수
//		= 발생할 수 있는 모든 상황
//		윷이 1개만 있다면 경우의 수는 2가지
//		= 안 뒤집히거나(0) 뒤집히거나(1)
//		윷이 2개라면 경우의 수는 4가지
//		= 0 0 / 0 1 / 1 0 / 1 1 
//		윷이 3개라면 경우의 수는 8가지
//		= 000 / 001 / 010 / 100 / 011 / 101 / 110 / 111
//		윷이 한 개씩 추가될 때마다 2배씩 늘어난다. (2진수) 
//		윷이 4개라면 경우의 수는 16가지
//		int yut = r.nextInt(16); 하고 케이스를 조절.
		
		}

	}

}
