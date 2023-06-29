package array2;

public class Test02 {

	public static void main(String[] args) {
		// 버블 정렬(Bubble sort)
		//- 인접한 두 항목을 비교하여 교체하며 정렬하는방식
		//- 큰 데이터가 좌측에 있으면 교체, 아니면 통과
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		int temp;
		
		for(int i = 0; i < 5; i++) {
			
			if (data[0] > data[1]) { //큰 데이터가 좌측에 있을 경우
				
				//교체 
				temp = data[0];	
				data[0] = data[1];
				data[1] = temp;
				
			} else {
				//통과
			}

			System.out.println(data[i]);
			
		}
		
	}

}
