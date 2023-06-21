package data3;

public class Test05 {
	
	public static void main(String[] args) {
		// 30세 이상 
		// 이번 년도가 짝수 해라면 짝수년도 출생자가 대상 
		// 이번 년도가 홀수 해라면 홀수년도 출생자가 대상
		
		//입력
		int Birth = 1985;
		int year = 2023;
		
		//계산
		//유저의 나이
		int age = year - Birth + 1;
		
		//30세 이상인지 판단
		boolean isAge = age >= 30;
		
		//이번 년도가 짝수 해라면 짝수년도 출생자가 대상
		boolean isEven = (year % 2 == 0) && (Birth % 2 == 0);
		// 이번 년도가 홀수 해라면 홀수년도 출생자가 대상
		boolean isOdd = (year % 2 != 0) && (Birth % 2 != 0);
		
		// 30세 이상 && (짝수년도 짝수해 || 홀수년도 홀수해)
		boolean result = isAge && (isEven || isOdd);
		
		//출력 
		System.out.println(result);
		
	}
}
