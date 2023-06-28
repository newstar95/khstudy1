package array;

public class Test02 {

	public static void main(String[] args) {
		// 배열(array)
		//- 여러 개의 같은 종류 데이터를 저장할 수 있는 공간
		
		//생성 
		//a(리모컨) -------> [?][?][?] ------> [0][0][0]이 들어가 있다.
		int[] a = new int[3]; 
		//여기서 int는 정수가 아니라 정수 여러 개의 거치공간이다.
		//라면 1개와 라면 여러 개는 다른 형태이다.
		//휴대폰이랑 휴대폰 진열대의 차이이다.
		//차로 치면 주차장같은 존재
		
		System.out.println(a); //리모컨 정보 출력, 쓸 일이 없음
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
		
		

	}

}
