package oop.setter;

public class Test01 {

	public static void main(String[] args) {
		Student a = new Student();
		
		//코드의 문제점
		
		//[1] 잘못된 데이터 설정 가능									
		a.setup("피카츄", -70); 
		a.show();
											
		
		//[2] 하나의 정보만 바꿀 수 없다 .
		a.setup("피카츄", 50); //점수를 바꾸고 싶은데 이름까지 적어야 한다.
		a.show();
		
		a.setup("라이츄", 50); //이름을 바꾸고 싶은데 점수까지 적어야 한다.
		a.score = 50; //변수에 직접적으로 접근하는 일은 좋지 않음(잘못된 데이터를 막을 수 없음)
		a.show();

		//[1]해결법 - 데이터를 설정하는 부분에 조건을 추가하면 된다.
		//[2]데이터를 하나만 설정할 수 있는 메소드를 만든다.(Setter 메소드)
		
	}

}
