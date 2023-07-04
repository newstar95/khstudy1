package oop.total1;

public class TimeCalculator {
	public static Time plus(Time a, Time b) {
		Time result = new Time(a.getValue() + b.getValue());
		return result;
		//return a+b
	}
	
public static Time minus(Time a, Time b) {
	if(a.getValue() > b.getValue()) {
		Time result = new Time(a.getValue() - b.getValue());
		return result;
	} else {
		Time result = new Time(b.getValue() - a.getValue());
		return result;
		}
	}
}
