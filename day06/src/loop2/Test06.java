package loop2;

public class Test06 {

	public static void main(String[] args) {
		//누적 합계 구하기 
		//(Q1) 10을 10번 더하면 얼마예요?
		int total = 0;
		
		for(int i = 0; i < 10; i++) {
			total += 10; //더해 넣어라
		}
		System.out.println(total);
		
		//(Q2) 1부터 10까지 더하면 얼마예요?
		int total2 = 0;
		total2 += 1;
		
		for(int i = 1; i <= 10; i++) {
			total2 += i;
		}
		System.out.println(total2);
	} 
}
