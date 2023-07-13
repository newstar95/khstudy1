package api.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03_1 {

	public static void main(String[] args) {
		//= 비슷한 것들: 좋아요, 팔로우, 추천, 싫어요, 즐겨찾기, 구독, 알람, ...
		//= 토글(toggle): 두 가지 상태를 왔다갔다 하는 것(ex: 스위치)
		Set<Integer> like = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("글 번호: ");
			int input = sc.nextInt();
			
			if  (input == 0) {
				System.out.println("좋아요 누른 글 목록: " + like);
				break;
			} else if (like.contains(input)) {
				like.remove(input);
				System.out.println(input + "번 글에 좋아요를 취소했습니다.");
			} else {
				like.add(input);
				System.out.println(input + "번 글에 좋아요를 눌렀습니다.");
			}
		}
		sc.close();
	}

}
