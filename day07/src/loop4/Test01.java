package loop4;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//do-while 반복문
		//-먼저 실행하고 나서 반복을 결정해야 하는 상황에서 쓰는 구문
		//(일단 한 번 해보고 반복할지 말지 추가로...)
		//-ex : 사용자에게 시험점수를 입력받아 출력하는 프로그램
//		do {
//			//실행할 코드 - 사용자에게 점수를 입력받는 코드
//		}
//		while(잘못된 점수를 입력하면); 
		
		int score;
		Scanner sc = new Scanner(System.in);
		
		do {
			//실행할 코드 - 사용자에게 점수를 입력받는 코드
			System.out.print("점수 입력: ");
			score = sc.nextInt();
		}
		while(score < 0 || score > 100); 
		
		sc.close();

		//1. 문법적으로 까다롭다. (세미콜론, 괄호)
		//2. 외부에 변수를 선언해서 써야하는 피곤함 발생
		//3. while문으로 대체 가능
	}
}
