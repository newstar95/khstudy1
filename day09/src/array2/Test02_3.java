package array2;

public class Test02_3 {

	public static void main(String[] args) {
		// 버블 정렬(Bubble sort)
		//- 인접한 두 항목을 비교하여 교체하며 정렬하는방식
		//- 큰 데이터가 좌측에 있으면 교체, 아니면 통과
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//버블 정렬 k회차(인접한 두 개의 항목을 비교하여 큰 값을 우측으로 이동)
		//[0] vs [1] / [1] vs [2] / [2] vs [3] / [3] vs [4]
//		
//		<기초 정렬>
//		선택 정렬(Selection sort)	최소값 찾아서 교체하는 방식
//		버블 정렬(Bubble sort)	인접한 두 항목을 비교하여 교체하는 방식
//		삽입 정렬(Insertion sort)	

		for(int k=data.length-2; k >=0; k--) {
			for(int i = 0; i <= k; i++) {
				
				if(data[i] > data[i+1]) {
					
					int backup= data[i];	
					data[i] = data[i+1];
					data[i+1] = backup;
					
				}
				
			}
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}
	
}
