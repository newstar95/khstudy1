package api.lang.string;

public class Test05 {

	public static void main(String[] args) {
		//문자열 검사
		//= 전부 또는 일부분에 대한 검사를 위한 명령
		
		String nickname = "운영자입니다.";
		
		//운영자가 포함되어 있습니까?
		System.out.println(nickname.contains("운영자"));
		System.out.println(nickname.indexOf("운영자") >= 0);
		//위치도 알아야 하는 경우라면 contains이 아닌 indexOf를 고려해봐도 된다.
		
		
		//운영자가 어디 있습니까? 
		//= 문자열은 배열처럼 0부터 시작하도록 구성되어 있다.
		System.out.println(nickname.indexOf("운영자")); //좌측부터 탐색
		System.out.println(nickname.lastIndexOf("운영자")); //우측부터 탐색
		System.out.println(nickname.indexOf("없는글자"));//없으면 -1
		//절대로 나올 수 없는 값 -를 없는 값으로 치고 나오는 것
		
		
		//시작과 종료 글자 검사
		String uri = "https://www.naver.com";
		
		System.out.println(uri.contains("http")); //http가 포함되었나요?
		System.out.println(uri.indexOf("http") == 0); //http가 있는 위치가 0입니까?
		System.out.println(uri.startsWith("http")); //http로 시작합니까?
		System.out.println(uri.endsWith(".com")); 
		System.out.println(uri.lastIndexOf(".com") == uri.length() - ".com".length()); //이렇게 쓰는 거 피하기
		
		//글자의 원하는 위치 추출
		String text = "안녕하세요";
		System.out.println(text.charAt(0)); //0번 위치의 글자를 추출
		char ch = text.charAt(0);
		//아스키 코드를 활용한 검사식
//	boolean isAlphabet = (ch >= 65 && ch <= 90) || (ch >= 97 && ch<= 122);
		
		boolean isAlphabet = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<= 'z'); //쉽게 구현하는 방법
		
		System.out.println("isAlphabet = " + isAlphabet);
		
		boolean isKorean = ch >= '가' && ch <= '힣';
		System.out.println("isKorean = " + isKorean);
	}

}
