package array;

import java.util.Random;

public class Test09_1 {

	public static void main(String[] args) {
		// 로또 시뮬레이션
		// 로또번호 중에서 가장 많이 나오는 번호를 찾으려는 목적으로 랜덤을 이용하여 
		// 로또번호를 1000번정도 추첨하려고 합니다.
		// 1. 각 번호(1~45)가 몇 번 나왔는지 측정하여 출력하세요
		// 2. 가장 많이 나온 번호를 찾아서 출력하세요.
		// 잘 안풀리면 주사위로 바꿔서 주사위를 1000번 던졌을 때 1~6번까지 몇 번 나왔는지로 풀어보면 된다.
		// count 변수가 45개 있어야함. 45개의 숫자가 몇 번씩 나왔는지 세야하기 때문에
		// 
		Random r = new Random();
		
		int[] dice = new int[1000];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		for(int i = 0; i < dice.length; i++) {
			dice[i] = r.nextInt(6) + 1;
			}
		
		for(int i = 0; i < dice.length; i++) {
			if (dice[i] == 1) {
				count1++;
			} else if (dice[i] == 2) {
				count2++;
			} else if (dice[i] == 3) {
				count3++;
			} else if (dice[i] == 4) {
				count4++;
			} else if (dice[i] == 5) {
				count5++;
			} else if (dice[i] == 6) {
				count6++;
			}
		}
		System.out.println("1번 주사위: " + count1); 
		System.out.println("2번 주사위: " + count2);
		System.out.println("3번 주사위: " + count3);
		System.out.println("4번 주사위: " + count4);
		System.out.println("5번 주사위: " + count5);
		System.out.println("6번 주사위: " + count6);
		}
}
