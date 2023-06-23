package condition2;

import java.util.Scanner;

public class Test05_2 {

	public static void main(String[] args) {
		//입력
		//사용자에게 초를 입력 받아 게시글 시간 형식을 출력
				Scanner sc = new Scanner(System.in);
				//입력
				System.out.print("작성 시간 입력(초): ");
				int time = sc.nextInt();
				
				String s;
				//계산
				
				if ( time < 10 ) { 
					s = "방금 전";
				} else if ( time < 1 * 60) {
					s = time + "초 전";
				} else if ( time < 1 * 60 * 60) {
					s = time / 60 + "분 전";
				} else if ( time < 1 * 60 * 60 * 24) {
					s = time / 60 / 60 + "시간 전";
				} else if ( time < 1 * 60 * 60 * 24 * 365) {
					s = time / 60 / 60 / 24 + "일 전";
				} else {
					s = "오래 전";
				}
				
				//출력
				System.out.println(s);
				
	}
}
