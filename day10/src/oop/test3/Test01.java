package oop.test3;

public class Test01 {

	public static void main(String[] args) {
		WorldCupGoal w1= new WorldCupGoal();
		WorldCupGoal w2 = new WorldCupGoal();
		WorldCupGoal w3 = new WorldCupGoal();
		WorldCupGoal w4 = new WorldCupGoal();
		
		w1.rank = 1;
		w1.name = "킬리안 음바페";
		w1.country = "프랑스";
		w1.goal = 8;
		
		w2.rank = 2;
		w2.name = "리오넬 메시";
		w2.country = "아르헨티나";
		w2.goal = 7;
		
		w3.rank = 3;
		w3.name = "올리비에 지루";
		w3.country = "프랑스";
		w3.goal = 4;
		
		w4.rank = 4;
		w4.name = "홀리안 알바레스";
		w4.country = "아르헨티나";
		w4.goal = 4;
		
		System.out.println("순위: " + w1.rank);
		System.out.println("이름: " + w1.name);
		System.out.println("나라: " + w1.country);
		System.out.println("득점: " + w1.goal);
		System.out.println();
		
		System.out.println("순위: " + w2.rank);
		System.out.println("이름: " + w2.name);
		System.out.println("나라: " + w2.country);
		System.out.println("득점: " + w2.goal);
		System.out.println();

		System.out.println("순위 : " + w3.rank);
		System.out.println("이름: " + w3.name);
		System.out.println("나라: " + w3.country);
		System.out.println("득점: " + w3.goal);
		System.out.println();

		System.out.println("순위: " + w3.rank);
		System.out.println("이름: " + w3.name);
		System.out.println("나라: " + w3.country);
		System.out.println("득점: " + w3.goal);
		
	}

}
