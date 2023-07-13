package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test09_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<기념일 입력 프로그램>");
		System.out.print("날짜 입력: ");
		String input = sc.next();
		
//		LocalDate date = LocalDate.parse(input, 해석기준);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date = LocalDate.parse(input, fmt);
		
		LocalDate after100days = date.plusDays(100L);
		LocalDate after200days = date.plusDays(200L);
		LocalDate after300days = date.plusDays(300L);
		LocalDate after1years = date.plusYears(1L);
		LocalDate after2years = date.plusYears(2L);
		LocalDate after10years = date.plusYears(10L);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		System.out.println("100일: " +  after100days.format(fmt2));
		System.out.println("200일: " +  after200days);
		System.out.println("300일: " +  after300days);
		System.out.println("1주년: " + after1years);
		System.out.println("2주년: " + after2years);
		System.out.println("10주년: " + after10years);
	}

}