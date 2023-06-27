package random;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
//		윷놀이 게임
//		윷놀이는 빽도/도/개/걸/윷/모 중 하나가 랜덤으로 나옵니다.
//		1. 랜덤을 이용하여 윷놀이 1턴의 결과를 출력하도록 구현하세요.
//		2. 실제 윷놀이는 '개'가 가장 많이 나옵니다. 이것을 고려하여 코드를 변경하세요.
//		앞, 뒤 나올 확률은 50퍼
		
		Random r = new Random();
		int number = r.nextInt(6);
		
		String result;
		
		if (number == 0) {
			result = "빽도";
		} else if (number == 1) {
			result = "도";
		} else if (number == 2) {
			result = "개";
		} else if (number == 3) {
			result = "걸";
		} else if (number == 4) {
			result = "윷";
		} else {
			result = "모";
		}
		System.out.println("윷놀이 결과: " + result);
		

	}

}
