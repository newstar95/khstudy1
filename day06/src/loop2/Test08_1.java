package loop2;

public class Test08_1 {

	public static void main(String[] args) {
		//현명한 노인 문제
		int money = 1; //1원으로 시작
		
		for(int day = 1; day <= 30; day++) {
			System.out.println(day + "일차 = " + money + "원");
			money *= 2;
		}
	}
}
