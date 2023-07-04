package oop.keyword4;

import java.util.Random;

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
	
	//[4] 배열을 선택정렬하는 메소드
	//공개, 객체 없이, 반환 없이
	public static void sort(int[] data) {
		//선택 정렬
		for(int k=0; k < data.length-1; k++) {
			int minIndex = k;//k번 위치의 값이 가장 작다고 생각
			for(int i=k+1; i < data.length; i++) {//뒤에 있는 데이터와 비교하여
				if(data[minIndex] > data[i]) {//더 작은 값이 있다면
					minIndex = i;//교체!
				}
			}
			//System.out.println("minIndex = " + minIndex);
			
			int backup = data[minIndex];
			data[minIndex] = data[k];
			data[k] = backup;
		}
	}
	
	//[5] 배열을 뒤집는 메소드(reverse)
	public static void reverse(int[] data) {
		int left = 0; //처음위치
		int right = data.length-1; //마지막위치
	
		for (int i = 0; i < data.length/2; i++) {
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
			
			left++;
			right--;
			}
		
		}
	
	//[6]배열을 무작위로 섞는 메소드(shuffle)
	public static void shuffle(int[] data) {
		Random r = new Random();
		
		for(int i = 0; i < data.length; i++) {
			//셔플(뒤섞기)
			//- 같은 자리 제거
			//- 같은 자리가 나오면 다시 뽑아라 / 같은 자리가 나오면 하던 작업을(지금 하는 턴을) 무효화시켜라
			//[i] <----> [0~4]
			int index = r.nextInt(data.length);
		
				if(i == index) {
					i--;
					//continue 를 쓰거나 else문을 쓴다 
				} else {
					int backup = data[i];
					data[i] = data[index];
					data[index] = backup;
				}
				
			}
		
		}
	
	//[7]배열을 출력하는 메소드
	public static void print(int data[]) {
		for ( int i = 0; i < data.length; i++) {
			System.out.print( data[i] );
			System.out.print("\t");
		}
		System.out.println();
	}
	
	}	

