package loop2;

public class Test02 {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 1; i <= 99; i++) {
			boolean sevenTen = i / 10 == 7;
			boolean sevenOne = i % 10 == 7;
			if (sevenTen || sevenOne ) {
				count++;
			}
		}
		System.out.println(count);
	}
}

