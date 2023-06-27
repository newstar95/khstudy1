package loop3;

public class Test01 {

	public static void main(String[] args) {
		//for는 횟수(100번)가 주어졌을 때, 범위(1부터 99까지)가 주어졌을 때 유용
		//while 반복문 
		//= 횟수를 모를 때 사용
		//= 종료 시점을 알 때 사용 (ex 사용자가 0을 입력할 때까지 반복하세요)
		
		//ex : for구문과 비교(1부터 10까지 출력)
		for (int i = 1; i <= 10; i++) {
			System.out.println("for = " + i);
		}
		
		int n = 1;
		while(n <= 10) {
			System.out.println("while = " + n);
			n++;
		}
	}
}
