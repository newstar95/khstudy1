package oop.method4;

public class Menu {
	
	String name;
	String type;
	int money; //할인 전 금액이 저장되어야 함
	boolean event;
	
	//setup을 두 종류로 구현(메소드 오버로딩, method overloadaing) 
	//[1] 3개의 데이터가 들어오면 이벤트는 안 하는 걸로 생각하여 처리
	//[2] 4개의 데이터가 들어오면 이벤트 정보도 설정하는 걸로 처리
	void setup(String name, String type, int money) {
		this.name = name;
		this.type = type;
		this.money = money;
		this.event = false;
	}
	
	void setup(String name, String type, int money, boolean event){
		//그래서 이쪽에서 할인하지 않음
		this.name = name;
		this.type = type;
		this.money = money;
		this.event = event;
		
	}
	
	//보여줄 때 할인을 처리해야함
	void show() {
		System.out.println();
		System.out.println("<메뉴 정보>");
		
		System.out.print("메뉴명: " + name);
		
		if(this.event) {
			System.out.print("(행사중)");
		}
		System.out.println();
		
		System.out.println("분류: " + type );
		
		if(this.event) { //행사중이면
			System.out.print("할인적용가: " + this.money * 80/100 + "원 "); //할인율을 바꿀 수 있으면 멤버필드에 할인율 변수가 있어야함
			System.out.print("원래금액: " + this.money  + "원");
			System.out.println();
		} else {
			System.out.println("판매가: " + money  + "원");
		}
		
//		System.out.println("행사 여부: " + event); 사용자에게 줄 필요 없음
	}
	
}
