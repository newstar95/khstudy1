package data;

public class Test10 {
	public static void main(String[] args) {
		//내 풀이
//		int time = 60;
//		int min = 1;
//		
//		int yesterdayTime = 2;
//		int yesterdayMinute = 45;
//		
//		int todayTime = 1;
//		int todayMinute = 50;
//		
//		int yesterday = (time * yesterdayTime) + (min * yesterdayMinute);   
//		int today = (time * todayTime) + (min * todayMinute); 
//		
//		int total = yesterday + today;
//		int hour = total / 60;
//		int minute= total % 60;
		
//		System.out.println(hour);
//		System.out.println(minute);
		
		
		//강사님 풀이
		//시간은 가장 작은 단위로 변환하여 푼다.
		//입력
		int yesterdayHour = 2, yesterdayMin = 45;
		int todayHour = 1, todayMin = 50; 
		
		//계산
		int yesterdayTime = yesterdayHour * 60 + yesterdayMin;
		int todayTime =  todayHour * 60 + todayMin;
		
		int time = yesterdayTime + todayTime;
		int hour = time / 60;
		int minute = time % 60;
		
		//출력 
		System.out.println(hour);
		System.out.println(minute);
		
		
	}
}
