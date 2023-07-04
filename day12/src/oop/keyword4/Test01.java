package oop.keyword4;

public class Test01 {

	public static void main(String[] args) {
		int result1 = Robot.square(11);
		System.out.println("제곱: " + result1);
		
		float result2 = Robot.triangle(3, 7);
		System.out.println("삼각형의 넓이: " + result2);
		
		double result3 = Robot.circle(5);
		System.out.println("원의 넓이: " + result3);
		
	}

}
