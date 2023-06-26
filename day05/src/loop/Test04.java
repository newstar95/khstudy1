package loop;

public class Test04 {

	public static void main(String[] args) {
		for( int i = 1; i < 100; i++ ) {
			if(i / 10 == 5 || i % 10 == 5) { //10의 자리가 5라고 표현할 수도 있지만 50 < 60 이렇게 표현할 수도 있다.
				System.out.println(i);
			}
		}	
	}	
}
