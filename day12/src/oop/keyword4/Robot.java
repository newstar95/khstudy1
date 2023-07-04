package oop.keyword4;

public class Robot {
	//[1] 제곱 계산 기능
	public static int square(int num) {
		return num * num;
	}
	
	public static double square(double num) {
		return num * num;
	}
	
	public static float square(float num) {
		return num * num;
	}
	
	//[2] 삼각형의 넓이를 구하는 메소드
	public static float triangle(int a, int b) {
		return (float)a * b / 2;
	}
	
//	public static float Triangle(float a, float b) {
//		return (float)a * b / 2;
//	}
	
	//[3] 원의 넓이를 구하는 메소드(넓이 = 반지금 * 반지름 * 원주율
	public static double circle(int radius) {
//		return radius * radius * 3.14;
//		return Robot.Square(radius) * 3.14;
		return square(radius) * 3.14;
	}
	
	public static float circle(float radius) {
		return square(radius);
	}
}

//	public static int Sort(int a[]) {
//
//			for(int i = 0; i < a.length + 1; i++) {
//				int minIndex = i;
//				for(int k = i + 1; k < a.length; k++ ) {
//					if(a[minIndex] > a[k]) {
//						minIndex = k;
//					}
//					
//					int backup = a[minIndex];
//					a[minIndex] = a[k];
//					a[k] = backup;
//					
//				}
//				
//			}
//			for ( int i = 0; i < a.length; i++) {
//				return a[i];
//			}
//	
//		}

