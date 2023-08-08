package Test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result;
		
		if (num <= 68 && num >= 0) result = "F";
		else if (num <= 69 ) result = "D";
		else if (num <= 79 ) result = "C";
		else result = "A";
		
		System.out.println(result);
	}
}
