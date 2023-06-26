package loop2;

public class Test08 {

	public static void main(String[] args) {
		int money = 1; //1일차는 1원
		long money40 = 40;
		
		for (int i = 1; i <= 30; i++) { //30일동안
			if ( i == 1 ) { //첫날일때
				money = 1;
			} else { //첫날 이후
				money = money * 2;
			}
			System.out.println(i + "일차: " + money + "원");
		}
		System.out.println("총 금액: " + money + "원");
		
		for (int i = 1; i <= 10; i++) {
			money40 = money * 2;
		}
		System.out.println("40일차 금액: " + money40 + "원");
		}
	}

