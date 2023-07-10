package api.lang.string3;

public class Test01 {

	public static void main(String[] args) {
		// 문자열 합성
		//= 원하는 문자열을 만들기 위해 지속적인 연결을 하는 작업
		//= 문자열 덧셈은 성능이 매우 안좋으며 이유는 문자열이 불변이기 때문이다.
		//= 덧셈용 도구를 사용하된 된다.(StringBuffer/StringBuilder)
		//= 문자열이 불변이니 쓰레기가 계속 생기기 때문에 다른 도구를 사용
		
		StringBuffer buffer = new StringBuffer();
		//비어있는 문자열을 대체
		//문자열을 조각조각 모아서 합쳐야 할 때 사용
		
		buffer.append("(");
		buffer.append("신발끈");
		buffer.append("|");
		buffer.append("개나리");
		buffer.append(")");
		String regex = buffer.toString();
		
		String line = "이런 신발끈 개나리 진달래같은!!!";
		
		//line = line.replaceAll("신발끈|개나리","***"); //regex 는 정규표현식을 말하는 것
		//중간에 포함되는 것이기 때문이 시작이랑 종료기호는 들어가면 안된다.

		line = line.replaceAll(regex,"***");
		
		System.out.println(line);
	}

}
