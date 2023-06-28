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
		
//		a = 10; //error(컴파일에러)
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40; //코드 상의 오류는 없으나 실행하면 error(런타임에러)
		
		System.out.println(a); //리모컨 정보 출력, 쓸 일이 없음
		System.out.println(a[0]); //a가 보는 +0지점 데이터
		System.out.println(a[1]); //a가 보는 +1지점 데이터
		System.out.println(a[2]); //a가 보는 +2지점 데이터
		System.out.println(a[3]); //없음(error)
		
	
		
		

	}

}
