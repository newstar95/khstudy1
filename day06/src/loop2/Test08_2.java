package loop2;

public class Test08_2 {

	public static void main(String[] args) {
		//현명한 노인 문제
		int money = 1; //1원으로 시작
		int total = 0; //합계는 최초 0
				
		for(int day = 1; day <= 30; day++) {
			System.out.println(day + "일차 = " + money + "원");
			total += money; //돈을 누적시켜라
			
			money *= 2; //돈을 두 배로 증가시켜라
			}
		System.out.println("총 받는 금액 = " + total + "원");
		}
	}
