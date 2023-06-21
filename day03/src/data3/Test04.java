package data3;

public class Test04 {

	public static void main(String[] args) {

		//청소년 판정 프로그램
		//= 14~19 사이
		//= 14세 이상 19세 이하
		
		int age = 15;
		
//		boolean teen = 14 <= age <= 19; //안 된다.
		boolean teen = 14 <= age && age <= 19;
		
		boolean free = 8 < age || age >= 65;
		System.out.println(teen);
		
		//논리연산 - 논리끼리 계산하기 위한 기호
		//&&(and연산) - 왼쪽과 오른쪽이 모두 참인 경우(참참참)
		//||(or)연산 - 왼쪽과 오른쪽이 모두 거짓인 경우 거짓
	}
}
