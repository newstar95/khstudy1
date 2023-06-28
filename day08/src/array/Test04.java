package array;

public class Test04 {

	public static void main(String[] args) {
		// '자바', '파이썬', '루비'를 저장하기 위한 배열을 생성하고
		// 데이터를 저장한 뒤 출력하세요.
		
		//s ------>[?][?][?] ----->[null][null][null] null은 글자가 아닌 없다라는 표식
		//참조형은 null이 기본값이다.
		
		String s[] = new String[4];
		s[0] = "자바";
		s[1] = "파이썬";
		s[2] = "루비";
		s[3] = "C++";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);

	}

}
