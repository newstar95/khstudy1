package oop.method1;

public class Test01 {

	public static void main(String[] args) {
		WorldCupGoal w1= new WorldCupGoal();
		WorldCupGoal w2 = new WorldCupGoal();
		WorldCupGoal w3 = new WorldCupGoal();
		WorldCupGoal w4 = new WorldCupGoal();
		
		
		//출력
		//p1을 주인공으로 해서 show에 있는 코드를 실행해라 
		//자주 쓰는 것들을 보관해놓고 불러오는 것을 모듈이라고 함
		
		w1.setup(1, "킬리안 음바페", "프랑스", 8);
		w2.setup(2, "리오넬 메시", "아르헨티나", 7);
		w3.setup(3, "올리비에 지루", "프랑스", 4);
		w4.setup(4, "홀리안 알바레스", "아르헨티나", 4);
		
		w1.show();
		w2.show();
		w3.show();
		w4.show();
		//w4.show = 100//에러

		
	}

}
