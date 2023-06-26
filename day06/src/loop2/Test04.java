package loop2;

public class Test04 {

	public static void main(String[] args) {
		//소수는 나누기가 어려운 숫자들을 말합니다.
		//나누기가 어렵다는 것은 1이나 자기자신 빼고 나누어 떨어지는 수가 없다는 뜻
		//5는 소수이다. (1, 5 뺴고 딱 떨어지는 수가 없음)
		//소수가 아니라는 것은 1과 자기자신을 제외하고도 나누어 떨어지는 수가 있다는 뜻 = 합성수
		//6은 소수가 아니다. (1, 6 말고도 2, 3 등 나누어 떨어지는 수가 있음)
		
		//입력
		int num = 3;
		
		int count = 0;
		
		for (int i = 0; i < num; i++) {
			if (num % num == 0) { //나누어 떨어질때
			}
			count++; //카운트 증가
		}
		if (count == 2) {
//			System.out.println("소수입니다.");
			System.out.println(count);
			
		} else {
//			System.out.println("소수가 아닙니다.");
			System.out.println(count);
		}
	}
}
