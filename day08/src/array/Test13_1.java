package array;

public class Test13_1 {

	public static void main(String[] args) {
		//'30', '50', '20', '10', '40' 이라는 데이터가 저장된 배열이 있을 때
		//이 배열의 데이터 위치를 완전히 반대로 뒤집어 보세요.
		//뒤집은 다음 데이터를 출력
		
		//몇 칸이든 통하는 방법
		//= 바꾸는 횟수는 데이터 개수의 절반과 같다
		
		//40,10,20,50,30
		int[] data = new int[] {30,50,20,10,40};
		
		for (int i = 0; i < data.length/2; i++) {
			int left = i; // i는 왼쪽 위치
			int right = data.length-1-left; //오른쪽 위치 (1+2 = 3 /  2= 3-1 과 같은 맥락)
				
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
		}
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
