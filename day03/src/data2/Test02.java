package data2;

public class Test02 {

	public static void main(String[] args) {
		
//		double m = 1.8;
//		int kg = 80;
		
		int cm = 180;
		int kg = 80;
		 
		double m = cm / 100.0;
//		double m = (double)cm / 100;
		
		double bmi = kg / (m*m);
		// double bmi = kg / m / m;
		
		System.out.println(bmi);
	}
}
