package array3;

public class Test04_1 {

	public static void main(String[] args) {
		
		String[][] subject = new String[][] {
			{"자바", "스프링", "안드로이드"},
			{"파이썬", "판다스", "장고"}
		};
		
		//subject	--> subject[0]	-->	["자바"]["스프링"]["안드로이드"]
		//            	--> subject[1]	-->	["파이썬"]["판다스"]["장고"]
		
		//2차원 배열의 출력구문은 고정이기 때문에 외울만 하다.
		
		for(int i = 0; i < subject.length; i++) {
			for(int k = 0; k < subject[i].length; k++) {
				System.out.print(subject[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
