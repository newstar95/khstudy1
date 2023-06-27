package loop3;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//숫자 모래성 땅따먹기
		//최초의 100이라는 값을 정해두고 사용자에게 한 자리 숫자(1~9)를 입력받아 
		//차감을 합니다.
		//차감을 하다가 0 이하가 되면 반복을 종료하고 게임 오버 메세지를 출력
		//몇 번만에 게임 오버가 되었는지 측정하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sand = 100; // 최초의 100이라는 값 설정
		
		int count = 0;
		
		while(true) {
			System.out.print("한 자리 숫자 입력: ");
			int user = sc.nextInt(); //사용자에게 한 자리 숫자(1~9)를 입력받기
			count++;
			sand -= user;
//			System.out.println("total= " + total);
			//차감을 하다가 0 이하가 되면 반복을 종료하고 게임 오버 메세지를 출력
			//몇 번만에 게임 오버가 되었는지 측정하여 출력
			if (sand <= 0) {
				System.out.println("GAME OVER...");
				System.out.println(count + "번 만에 게임 오버가 되었습니다.");
				break;
			} else {
				System.out.println("무너지지 않았다!");
			}
		}
		sc.close();
	}
}
