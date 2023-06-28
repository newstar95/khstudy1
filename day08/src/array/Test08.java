package array;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// 학생 5명의 시험점수를 입력받아서 저장하고 다음 문제를 푸세요.
		//1. 통과하지 못한 학생의 점수만 출력
		//2. 우수한 성적(90점 이상)으로 통과한 학생의 점수만 출력
		//3. 만약 75점인 학생이 전학을 왔다면 몇 등인지 구해서 출력

		Scanner sc = new Scanner(System.in);
		
		int[] num =  new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("학생 점수 입력: ");
			num[i] = sc.nextInt();
			}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 60) {
				System.out.println("통과하지 못한 학생의 점수: " + num[i]);
			} else if (num[i]>= 90) {
				System.out.println("우수한 성적으로 통과한 학생의 점수: " + num[i]);
			}
		}
		
	
		sc.close();
	}
}
