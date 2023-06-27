package random;

import java.util.Random;

public class Test03_2 {

	public static void main(String[] args) {
		// 윷놀이 한 턴 구현
		//(약속) 빽도 = 0, 도 = 1,2,3 개 = 4,5,6,7,8,9, 걸 = 10,11,12,13, 윷 = 14, 모 = 15
		Random r = new Random();
		
		int yut = r.nextInt(16);
		
		switch(yut) {
		case 0: System.out.println("도"); break; 
		case 1,2,3: System.out.println("빽도"); break;
		case 4,5,6,7,8,9: System.out.println("개"); break;
		case 10,11,12,13: System.out.println("걸"); break;
		case 14: System.out.println("윷"); break;
		case 15: System.out.println("모"); break;
		
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
