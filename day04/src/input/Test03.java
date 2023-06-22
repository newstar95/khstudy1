package input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 숫자로 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어점수를 숫자로 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 숫자로 입력: ");
		int mat = sc.nextInt();
		
		sc.close();
		
		//계산
		int tot = kor + eng + mat;
		float avg = (float)tot / 3;
		
		//출력
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + mat);
		
		System.out.println("<계산 결과>");
		System.out.println("점수 총점: " + tot);
		System.out.println("점수 평균: " + avg);
		
	}
}
