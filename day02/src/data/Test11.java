package data;

public class Test11 {
	public static void main(String[] args) {
		int startHour = 9, startMin = 40;
		int endHour = 12, endMin = 25;
		
		int useTime = ((endHour * 60) + endMin) - ((startHour * 60) + startMin);
		
		//강사님 풀이
		// int startTime =  startHour * 60 + startMin;
		// int endTime = endHour * 60 + endMin;
		
		// int useTime = endTime - startTime;

		int useHour = useTime / 60;
		int useMin = useTime % 60;
		
		int hourPrice = 1200;
		int minPrice = hourPrice / 60; 
		
		int usePrice =  (useHour *  hourPrice) + (useMin * minPrice);

		//강사님 풀이
		//int usePrice = useTime * minPrice;
		
		System.out.println(useHour);
		System.out.println(useMin);
		System.out.println(usePrice);
	}
}
