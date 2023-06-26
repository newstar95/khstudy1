package loop;

public class Test05 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int one = i % 10;
			int ten = 1 / 10;
			
			boolean numOne= one == 3 || one == 6 || one == 9; 
			boolean numTen= ten == 3 || ten == 6 || ten == 9;
			
			if ( numOne || numTen ) {
				System.out.println(i);
				}
			}
		}
	}
