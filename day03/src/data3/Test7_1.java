package data3;

public class Test7_1 {

			public static void main(String[] args) {
				//윤년 계산 프로그램
				
				//입력
				int year = 2022;
				
				//계산
				//[1] 4의 배수면 윤년이다.	include 조건
				//[2] 100의 배수가 아니어야 한다. exclude 조건
				//[3] 400의 배수면 윤년이다. include 조건
				// 중요도는 3 > 2 > 1번이다.
				
				boolean is4 = year %  4 == 0;
				boolean is100 = year %  100 != 0;
				// boolean is100 = !(year %  100 == 0);
				boolean is400 = year % 400 == 0;
				boolean leapYear =  is400 || is4 && is100;
				//먼저 확인해봐야하는 조건들이 꼭 생긴다. is400이 true면 < is4 && is100 >은 실행을 안 시킨다. 
				//굳이 실행을 안 해봐도 400의 배수면 윤년이기 때문이다. 그래서 먼저 쓰는 것이 좋다.
				
				//출력
				System.out.println(leapYear);
			}
	}
