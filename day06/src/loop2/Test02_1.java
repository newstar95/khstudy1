package loop2;

public class Test02_1 {

	public static void main(String[] args) {
		//카운트를 세려면 출력이 가능해야 한다.
		
		int count = 0;
		
		for(int i = 1; i <= 99; i++) {
			boolean ten = i / 10 == 7;
			boolean one = i % 10 == 7;
			if(ten || one) {
				count++;
			}
		}
			System.out.println(count);
	}
}
