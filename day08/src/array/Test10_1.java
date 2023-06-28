package array;

public class Test10_1 {

	public static void main(String[] args) {
		//배열의 주요 계산방법 - 최대/최소 찾기
		//- data의 가장 큰 값이 얼마인가? 어디있는가? 
		//- data의 가장 작은 값이 얼마인가? 어디있는가?
		
		//최대값 최소값을 찾는 코드보다 최대값이 있는 위치를 찾는 코드를
		//기억하는게 더 좋다.
		
		int[] data = new int[] {30,50,20,10,40};
		// data -------> [30][50][20][10][40] (length = 5)
	
		//최대값은 [0]위치가 가장 크다고 가정하고 
		//[1]부터 끝까지 비교하여 더 큰 데이터가 나오면 덮어쓰기하여 구한다.
		
		int maxIndex = 0; //0번 위치가 가장 크다고 정하자!
		for(int i = 1; i < data.length; i++) {
			if(data[maxIndex] < data[i]) { //더 큰 숫자가 나오면
				maxIndex = i; //위치를 갈아 엎는다.
			}
		}
		System.out.println("최대값 위치 = " + maxIndex);
		System.out.println("최대값 = " + data[maxIndex]);
	}
}
