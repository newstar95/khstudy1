package condition3;

public class Test04_3 {

	public static void main(String[] args) {
		//switch로 풀이 (java 13 이상)
		
		//입력
		int year = 2004;
		int month = 2;

		//계산
		int days;
		
		//출력
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			days = 31;
			break;
		case 4, 6, 9, 11:
			days = 30;
			break;
//		case 2:
		default:
			boolean leapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
			if (leapYear) {
				days = 29;
			} else {
			days = 28;
			}
			break;
		}
		System.out.println(days);
	}
}
