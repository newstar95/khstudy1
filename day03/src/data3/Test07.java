package data3;

public class Test07 {

			public static void main(String[] args) {
				//2000 true
				//2100 false
				//2200 false
				//2002 false
				//2004 true
				//2024 true
				//2400 true
				
				//입력
				int year = 2000; 
				
				//계산
				//4의 배수인 해는 true
				boolean year4 = ( year % 4 ) == 0; 
				
				//100의 배수인 해
				boolean year100 = ( year % 100 ) != 0;
						
				//400의 배수인 해
				boolean year400 = ( year % 400 ) == 0;
			
				//100의 배수인 해는 4의 배수라도 flase
				//400의 배수인 해는 100의 배수라도 true
				// && and 두 값이 참일 때만 참 / || or 두 값 중 하나만 참이어도 참
				boolean result = year4 && year100 || year400;

				//출력
				System.out.println(result);
			}
	}
