package data3;

public class Test5_1 {
	
	public static void main(String[] args) {
		//결론
		//= 30세 이상 && (짝수해이면서 짝수년생 || 홀수해이면서 홀수년생)
		//= condition1 && (condition2 || condition3)
		
		//입력
		int birth = 1985;
		int year = 2023;
		
		
		//계산
		int age = year -  birth + 1;
		boolean condition1 = age >= 30; // 의사코드 30세 이상인가?
		
		//짝수년도 && 짝수년생인가? (이면서, 그리고는 &이다)
		boolean condition2a = (year % 2) == 0;
		boolean condition2b = (birth % 2) == 0;
		boolean condition2 = condition2a && condition2b;
	
		//홀수년도 && 홀수년생인가?
		boolean condition3a = (year % 2) != 0;
		boolean condition3b = (birth % 2) != 0;
		boolean condition3 = condition3a && condition3b; 
		
		boolean condition = condition1 && (condition2 || condition3);
		
		
		//출력 
		System.out.println(condition);
		
	}
}
