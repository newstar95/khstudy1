package api.exception;

public class Test06_4 {
	public static void main(String[] args) {
		int year = 2021;
		int month = 3;
		int day = 15;
		
		int days = DateCalculator.getDayCountBefore(year, month, day);
		System.out.println("days = " + days);
		
		int globalAge = days / 365;
		System.out.println("만나이 = " + globalAge);
	}
}

