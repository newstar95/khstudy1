package condition3;

public class Test04_1 {

	public static void main(String[] args) {
		//날짜 문제+윤년 
		//if로 풀이
		
				//입력
				int month = 4;
			
				//출력
				if(month == 1 || month == 3 || month == 5 
						|| month == 7 || month == 8 || month == 10 || month == 12) {
					System.out.println("31일");
				}
				else if(month == 4 || month == 6 || month == 9 || month == 11) {
					System.out.println("30일");
				}
				else {//2월
					System.out.println("28일");
				}
		}
}