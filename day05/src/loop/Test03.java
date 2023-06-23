package loop;

public class Test03 {

	public static void main(String[] args) {
		//1부터 100사이 홀수 출력
		//- 1, 3, 5, 7, 9 ... 93, 95 ... (50개)
		//- 횟수로 처리하기 어려우므로 범위를 정해서 처리
		//for(1부터 99까지 2씩 늘어나도록);
		
//		for(int i = 0; i < 100; i++) {
//			if ( i % 2 != 0) {
//				System.out.println(i + " ");
//			}
//		}
		
		for(int i = 1; i < 100; i += 2) {
			System.out.println(i); //hold 해야함
		}
	}
}
