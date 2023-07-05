package oop.total1_review;

public class TimeCalculator {
	
	public static Time plus(Time a, Time b) {
		long sum = a.getValue() + b.getValue();
		Time result = new Time(sum);
		return result;
	}
	
	public static Time minus(Time a, Time b) {
		long ddff;
		if (a.getValue() > b.getValue()) {
			ddff = a.getValue() - b.getValue();
		} else {
			ddff = b.getValue() - a.getValue();
		}
		Time result = new Time(ddff);
		return result;
		
		
	
	
}






			
}