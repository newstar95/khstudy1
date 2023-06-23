package condition2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//사용자에게 초를 입력 받아 게시글 시간 형식을 출력
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.print("작성 시간 입력(초): ");
		int min = sc.nextInt();
		
		//계산
		//방금 전 - 10초가 되지 않음
		//?초 전 - 10초 이상 1분이 되지 않음
		//?분 전 - 1분이상 1시간 미만
		//?시간 전 - 작성한 지 1시간 이상 1일 미만
		//?일 전 - 작성한 지 1일 이상
		sc.close();
		
		
//		String s;
//		if (min < 10) {
//			s = "방금 전";
//		} else if (min < 60) {
//			s = "초 전";
//		} else if () {
//			s = "분 전";
//		} else if () {
//			s = "시간 전";
//		} else {
//			s = "일 전";
//		}
//		System.out.println( min +  s + "에 작성되었습니다.");
//		
	}
}
