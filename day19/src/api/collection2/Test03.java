package api.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {

	public static void main(String[] args) {
		Set<Integer> like = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("글 번호: ");
			int input = sc.nextInt();
			
			if  (input == 0) {
				System.out.println("좋아요 누른 글 목록: " + like);
				break;
			} else if (like.contains(input)) {
				System.out.println(input + "번 글에 좋아요를 취소했습니다.");
				like.remove(input);
			} else {
				System.out.println(input + "번 글에 좋아요를 눌렀습니다.");
				like.add(input);
			}
		}
		sc.close();
	}

}
