package array;

public class Test11 {

	public static void main(String[] args) {
		// 5명의 키 데이터가 다음과 같을 때 가장 키가 작은 사람의 위치와 값을 출력
		//- 데이터: '150.8', '180.2', '175.9', '162.7', '170.3'
		
		float[] cm = new float[] {150.8f, 180.2f, 175.9f, 162.7f, 170.3f};
		
		int minIndex = 0;
		
		for( int i = 1; i < cm.length; i++) {
			if (cm[minIndex] > cm[i]) {
				minIndex = i;
			}
		}
		System.out.println("키가 가장 작은 사람의 값 위치: " + minIndex + "번 인덱스");
		System.out.println("키가 가장 큰 사람의 cm: " + cm[minIndex]);
	}
}
