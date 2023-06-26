package loop;

public class Test06 {

	public static void main(String[] args) {
		//반복 범위의 변화를 줘서 다양한 반복을 구현
		
		//(Q) 10부터 0까지 숫자가 줄어들며 출력하도록 구현
		for (int i = 10; i >= 0; i--){
			System.out.println(i);
		}
		
		//(Q) 10분의 1씩 줄어들며 출력하는 반복문 구현
		for (int i = 12345; i > 0; i /= 10) { // (i = i / 10)
			System.out.println(i);
			System.out.println(i % 10); // 오른쪽부터 숫자를 한 자리씩 검사 가능(끝에 한 자리만 보겠다)
		}
		
		//(Q) 두 배씩 늘어나는 반복문 구현
		for(int i = 1; i <= 1000; i *=2) { // (i = i * 2)
			System.out.println(i);
		}
	}
}
