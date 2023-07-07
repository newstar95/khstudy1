package api.lang.string2;

import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
		//정규 표현식(REGular EXpression)
		// 사용자에게 휴대전화번호를 입력받아 유효한지 아닌지 판정하여 출력

		
		String number = "01012123434";
		String regex = "^01[016-9][0-9]{3,4}[0-9]{4}$"; 
	//String regex = "^(010|011|016|017|018|019)-?[0-9]{3,4}[0-9]{4}$";
	//String regex = "^01[016-9][1-9][0-9]{2,3}[0-9]{4}$"; //정확한

		
     //boolean isValid = Pattern.matches(regex, number);
		boolean isValid = number.matches(regex);
		
		if (isValid) {
			System.out.println("유효한 전화번호입니다.");
		} else {
			System.out.println("잘못된 전화번호입니다.");
		}
	}

}
