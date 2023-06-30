package oop.method2;


//클래스
public class Player {
	
	//멤버 필드(member field) - 데이터
	String name;
	String event;
	String sumWin;
	int goldMedal;
	int silverMedal;
	int bronzeMedal;
	
	//멤버 메소드(member method) - 코드
	void show() {
		System.out.println("<메달리스트 정보>");
		System.out.println("이름: " + this.name);
		System.out.println("종목: " + this.event);
		System.out.println("구분: " + this.sumWin);
		System.out.println("금메달: " + this.goldMedal);
		System.out.println("은메달: " + this.silverMedal);
		System.out.println("동메달: " + this.bronzeMedal);
		
	}
	
	void setup(String name, String event, String sumWin, 
			int goldMedal, int silverMedal, int bronzeMedal) {
		this.name = name;
		this.event = event;
		this.sumWin = sumWin;
		this.goldMedal = goldMedal;
		this.silverMedal = silverMedal;
		this.bronzeMedal = bronzeMedal;
	}
}
