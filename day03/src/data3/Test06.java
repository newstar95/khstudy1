package data3;

public class Test06 {

	public static void main(String[] args) {
		//두 자리 이하의 수가 주어짐
		//3, 6, 9가 포함되어 있는 지 판정 후 출력
		
		//입력
		int num = 95;
		
		//계산
		boolean number3a = (num / 10) == 3;
		boolean number3b = (num % 10) == 3;
		boolean number3 = number3a || number3b;
		
		boolean number6a = (num / 10) == 6;
		boolean number6b = (num % 10) == 6;
		boolean number6 = number6a || number6b;
		
		boolean number9a = (num / 10) == 9;
		boolean number9b = (num % 10) == 9;
		boolean number9 = number9a || number9b;
		
		boolean result = number3 ||  number6 ||  number9;
		
		// =============================
		//강사님 풀이
		//십의 자리에 369, 일의 자리에 369;
				// boolean tenClap = 십의 자리에 3 또는 6 또는 9;
				// booleanoneClap = 일의 자리에 3 또는 6 또는 9;
				// boolean clap = tenClap || oneClap;
				
				// int ten = number / 10;
				// int one = number % 10;
				// boolean tenClap = ten == 3 || ten == 6 || ten == 9;
				// boolean oneClap = one == 3 || one == 6 || one == 9;
				// boolean clap = tenClap || oneClap;
		
		//출력
		System.out.println(result);


	}
}
