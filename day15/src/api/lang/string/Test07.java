package api.lang.string;

public class Test07 {

	public static void main(String[] args) {
		//편집
		//= 주어진 문자열을 원하는 목적에 맞게 변형
		//= 문자열은 불변이므로 편집하면 신규 문자열이 생김
		
		//대소문자 변환
		String uri = "HTTP://WWW.NAVER.COM";
		
		System.out.println(uri.toLowerCase()); //소문자로 변형(신규 문자열 생성)
		
		//원형을 바꾸고 싶다면 의도적으로 변수에 집어넣어야 한다.
		//원래 문자열은 버려지고 새로 들어간다.
		System.out.println(uri);
		uri = uri.toLowerCase();
		System.out.println(uri);
		
		uri = uri.toUpperCase();
		System.out.println(uri);
		
		//불필요한 공백제거(유의미한 첫글자 앞과 마지막글자 뒤)
		String google = "      http://google.com     ";		
		
		System.out.println(google.trim()); //아스키코드 공백만 제거(기존)
		System.out.println(google.strip()); //유니코드 공백도 제거(신규)
		
		//구버전에는 strip가 없음
		
		//문자열 치환(찾아 바꾸기)
		String line = "나는 피자가 좋아요";
		System.out.println(line.replace("피자",  "자바"));
		System.out.println(line.replace("피자",  "자바").replace("좋아", "싫어"));
		//새로운 문자열이 생기는 것이기 때문에 바꾼 걸 또 바꿀 수 있다. 체이닝
		//문자열의 대부분 명령은 반환형이 문자열이기 때문에 지속적인 편집이 가능하다.
		
		//이클립스에서 이 페이지 내에서 ctrl + f를 누르면 검색을 할 수 있다
		//이클립스에서 프로젝트 내에서 원하는 글자가 적혀있는 파일을 찾고 싶을 때 ctrl + h
		
		
	}

}
