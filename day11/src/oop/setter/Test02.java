package oop.setter;

public class Test02 {

	public static void main(String[] args) {
		Student a = new Student();
		
		//코드의 문제점
		
		//[1] 잘못된 데이터 설정 가능				
		//[1]해결법 - 데이터를 설정하는 부분에 조건을 추가하면 된다.
		a.setup("피카츄", -70); 
		a.show();
											
		 
		//[2] 하나의 정보만 바꿀 수 없다.
		//[2]데이터를 하나만 설정할 수 있는 메소드를 만든다.(Setter 메소드)
		a.setScore(50);
		a.show();
		
		a.setName("라이츄"); //설정 외 다른 단어가 오면 들어가지 않는다. 
		a.show();
	
		//필드 개수와 세터 메소드 개수가 같아야 한다.
		//세터 메소드는 셋 + 필드명으로 이름을 설정한다.
		//어떠한 경우에도 세터 메소드로 연결시켜서 데이터 차단이 이루어지게 해야한다.
		
	}

}
