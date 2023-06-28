package array;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 사용자에게 실수 5개를 입력받아서 출력하도록 프로그램 구현
		Scanner sc = new Scanner(System.in);

		double data[] = new double[5];
		// double[] data = new double[5];
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("실수 입력: ");
			data[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.print("데이터 = ");
			System.out.println(data[i]);
		}
		sc.close();
	}
}
