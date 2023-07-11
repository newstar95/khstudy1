package api.time;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;

public class Test10 {

	public static void main(String[] args) {
		String startInput = "03:05";
		String endInput = "07:10";
		
		LocalTime sd = LocalTime.parse(startInput);
		LocalTime ed = LocalTime.parse(endInput);
		
		Duration d = Duration.between(sd, ed);
		
		//Period 클래스는 기간
		//Duration 클래스는 소요시간
		
		long time = d.getSeconds(); //이용시간(초)
		
		time /= 60;
		
		long hour =  time / 60;
		long minute = time % 60;
		
		//요금계산
		int pricePerHour = 1000;
		float pricePerMinute = 1000 / 60f;
		float totalPrice = pricePerMinute * time;

		System.out.println("총 이용시간: " + hour + "시간 " + minute + "분");
		System.out.println("총 이용요금: " + totalPrice);
		System.out.println("총 이용요금: " + Math.floor(totalPrice) + "원");
		System.out.println("총 이용요금: " + Math.round(totalPrice) + "원");
		System.out.println("총 이용요금: " + (int)Math.ceil(totalPrice) + "원");
		
	}

}
