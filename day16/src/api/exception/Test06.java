package api.exception;

public class Test06 {
	public static void main(String[] args) {
		String input = "2002-09";
		
		String year = input.substring(0,4);
		String month = input.substring(6,7);
		
		int num1 = Integer.parseInt(year);
		int num2 = Integer.parseInt(month);
		
		int yy = 2023;
		int mm = 9;
		
		int kAge = yy - num1 + 1;
		int eAge;
		
		if (num2 >= mm) {
			eAge = kAge - 1;
		} else {
			eAge = kAge - 2;
				
			}
		System.out.println(kAge);
		System.out.println(eAge);
		}
	}