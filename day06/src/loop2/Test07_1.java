package loop2;

public class Test07_1 {

	public static void main(String[] args) {
		//1. 30일동안 매일 하루에 20개씩 푸시업을 한다.
		//2. 30일동안 첫날은 10개, 둘째날부터는 3개씩 늘려가며 푸시업을 한다.
		//1번과 2번에 대한 각각의 푸시업 개수 합계를 구하여 출력하세요.
		
		
		//2. 30일동안 첫날은 10개, 둘째날부터는 3개씩 늘려가며 푸시업을 한다.
		int today = 0;
		int total = 0;
		
		for (int i = 1; i <= 30; i++) {
			today += 20;
			if (i == 1) {
				today += 10;
				} else {
					today += 3;
				}
			System.out.println(i + "일차" + "푸시업 개수: " + today);
		}
		System.out.println("총: " + today);
	}
}

