package oop.keyword4;

public class Test01 {

	public static void main(String[] args) {
		int result1 = Robot.square(11);
		System.out.println("제곱: " + result1);
		
		float result2 = Robot.triangle(3, 7);
		System.out.println("삼각형의 넓이: " + result2);
		
		double result3 = Robot.circle(5);
		System.out.println("원의 넓이: " + result3);
		
		//(주의) 참조형 데이터는 리모컨만 전달하면 외부에서 직접 제어 가능
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		Robot.sort(data); //리모컨 전달(call-by-reference)
		Robot.print(data);
		
		Robot.reverse(data);
		Robot.print(data);
		
		Robot.shuffle(data);
		Robot.print(data);
	}

}
