package loop2;

public class Test03 {

	public static void main(String[] args) {
		//369 박수치는 숫자 수 구하기
		int count = 0; 
		for(int i = 1; i <= 99; i++) {
			boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			if (one || ten) {
				count++;
			}
		}
		System.out.println(count);
	}
}
