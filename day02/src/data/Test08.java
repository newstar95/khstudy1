package data;

public class Test08 {
	public static void main(String[] args) {
		//정수의 특징 
		
		//[1] 정수는 소수점이 없는 수이다.
		//int a = 3.14;
		int a = 3;
		
		//[2] 정수는 크기에 따라 여러 종류로 나뉜다.
		//- byte, short, int, long
		byte b = 10;
		
		//[3] 크기를 벗어나면 저장이 안 된다.
		//byte c = 150; byte는 127까지만 저장이 된다. 
		//byte는 파일 같은 걸 처리할 때 쓰고 short는 잘 안 씀
		//int d = 1000000000;
		long e = 10000000000L; // = e라는 long 형태의 변수에 100억을 대입하세요. //long은 표시를 해야된다.
		System.out.println(e);
		
		//[4] 정수는 순환형 구조를 가진다 
		//int f = 1234567 * 1234567;
		long f = 1234567L * 1234567L;
		System.out.println(f);
		
		//[5] (중요) 정수끼리 계산하면 정수가 나온다.
		int v1 = 10;
		int v2 = 3;
		System.out.println(v1 / v2); //몫
		System.out.println(v1 % v2); //나머지
	}
}
