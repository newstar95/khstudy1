package loop2;

public class Test07_2 {

	public static void main(String[] args) {
		//(Q1) 30일동안 매일 20개씩
		
		int total = 0;
		
		for(int day = 1; day <= 30; day++) {
			System.out.println(day + "일차: 20개");
			total += 20;
		}
		System.out.println("합계 = " + total);
	}
}
