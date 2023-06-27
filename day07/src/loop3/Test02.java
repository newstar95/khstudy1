package loop3;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		// while의 활용
		//= 주사위가 6이 나올 때까지 던지는 코드
		
		//while의 조건은 보통 true를 쓰고 if문을 같이 써줘야 한다.
		Random r = new Random();
		
		//for(;;){ //밑에 와일과 같은 코드
		while(true) { //영원히 실행해라
			int dice = r.nextInt(6) + 1;
			System.out.println("주사위: "+ dice);
			
			//만약 주사위 값이 6이라면 반복을 종료하도록 조건을 설정
			if (dice == 6) {
				break;
			}
		}
	}
}
