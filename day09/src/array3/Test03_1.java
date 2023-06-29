package array3;

public class Test03_1 {

	public static void main(String[] args) {
		// 2차원 반복문으로 출력 (+length)
		
		
		
			float[][] data = new float[][] {
				{1.5f, 2.5f, 3.6f}, 
				{10.2f, 5.3f, 6.5f}
			};
			
			System.out.println(data.length); //2
			System.out.println(data[0].length); //3
			System.out.println(data[0].length); //3
			
			for (int k = 0; k < data.length; k++) {
				for(int i = 0; i < data[k].length; i++) {
					System.out.print(data[k][i] + "\t");
				}
				System.out.println();
			}
			
	}

}
