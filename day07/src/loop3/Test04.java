package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//업다운 게임
		//업다운 게임은 숫자를 맞추는 게임입니다.
		//1. 술래가 1부터 1000 사이의 정수 중에서 랜덤으로 하나의 숫자를 정합니다.
		//2. 술래가 아닌 사람이 정답을 예측합니다.
		//3. 예측한 정답과 실제 정답이 같으면 게임 끝
		//4. 예측한 정답과 실제 정답이 같지 않으면 '업' 또는 '다운'을 외친다.
		//5. '업'을 외치는 경우는 에측한 정답보다 실제 정답이 더 큰 수일 경우
		//6. '다운'을 외치는 경우는 예측한 정답보닷 실제 정답이 더 큰 수일 경우
		//컴퓨터가 술래를 하고 사용자가 정답을 맞추는 형태의 프로그램을 구현하세요.
		//정답을 맞추면 몇 번만에 맞췄는지 카운트하여 출력하시기 바랍니다.
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int number = r.nextInt(1000) + 1; //1번 생성
		int count = 1; //몇 번만에 맞췄는지 카운트 출력
		
		System.out.println("업다운 게임에 오신 것을 환영합니다!");
		System.out.println("1부터 1000사이의 숫자 중 하나를 컴퓨터가 골랐습니다...");
		while(true) {
			System.out.print("숫자를 맞춰보세요! 입력-> ");
			int user = sc.nextInt(); //2번 생성
			count++;
			
			if (user == number) { //3번 생성
				System.out.println(number + " 정답입니다!");
				break;
			} else if (user < number) { //5번 생성
				System.out.println("업!");
				
			} else { //6번 생성
				System.out.println("다운!");
			}
		}
		sc.close();
		System.out.println("총 " + count + "번 만에 맞췄습니다!");
	}
}
