package oop.method1;

//클래스
public class WorldCupGoal {
	//멤버 필드(멤버 변수) - 데이터
	String name; //순위
	String country; //이름
	int rank; //국가
	int goal; //골 수
	
	//멤버 메소드 - 공통코드(를 저장하는 코드저장소)
	//void 이름(){ 코드 }
	
	//출력용
	void show() { 
		
		//this = 클래스의 멤버를 의미(내꺼)
		System.out.println("순위: " + this.rank);
		System.out.println("이름: " + this.name);
		System.out.println("나라: " + this.country);
		System.out.println("득점: " + this.goal);
		
	}
	
	//초기화용
		
	//- 설정될 값을 알 수 없으므로 외부에서 전달받아서 초기화
	//- 매개변수
	
	void setup(int rank, String name, String country, int goal) {
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.goal = goal;
	}
}

