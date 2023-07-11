package api.time;

import java.time.LocalDate;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<기념일 입력 프로그램>");
		System.out.print("날짜 입력: ");
		String input = sc.next();
		
		String y = input.substring(0,4);
		String m = input.substring(5,7);
		String d = input.substring(8,10);
		
		int year = Integer.parseInt(y); 
		int month = Integer.parseInt(m); 
		int day = Integer.parseInt(d); 
		
		LocalDate a = LocalDate.of(year, month, day);
		
		System.out.println("100일: " + a.plusDays(100 - 1L));
		System.out.println("200일: " + a.plusDays(200 - 1L));
		System.out.println("300일: " + a.plusDays(300 - 1L));
		System.out.println("1주년: " + a.plusYears(1));
		System.out.println("2주년: " + a.plusYears(2));
		System.out.println("10주년: " + a.plusYears(10));
	}

}
