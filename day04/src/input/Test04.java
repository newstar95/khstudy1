package input;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입실 시각: ");
		int start = sc.nextInt();
		
		System.out.print("퇴실 시각: ");
		int end =  sc.nextInt();
		
		//계산
		int hour = (end - start) / 100;
		int min = (end - start) % 100;
		
		//출력
		
		System.out.println("수업에 참여한 시간은 " + hour + "시간" + min + "분 입니다.");
		
	}
}
