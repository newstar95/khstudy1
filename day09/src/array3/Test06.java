package array3;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
			//빙고판 만들기
			//-빙고판은 5x5 사이즈가 기본입니다.
			//-빙고판은 정사각형이며 홀수 크기만 가능합니다. 
			//-빙고판에는 숫자가 1부터 랜덤한 위치에 배치됩니다.
			//-한 칸에는 한 번의 숫자만 배치 가능합니다.
			//-1부터 25까지 "랜덤한 위치"에 배치
			//-빙고판을 제작한 뒤 출력하세요.
			//-크기도 변경 가능하도록 업그레이드 하세요.
			//숫자가 랜덤이 아니라 위치가 랜덤이어야함
		
			//=빙고판은 랜덤한 위치에 1부터 숫자를 배치하는 형태
		
			Random r = new Random();
			 
			//배열 생성
			int size = 5;
			int[][] bingo = new int[size][size] ;
			
			//데이터 초기화
			for (int i = 1; i <=  size*size; i++) {
				
				int x = r.nextInt(size);
				int y = r.nextInt(size);
				if(bingo[x][y] == 0) {
				bingo[x][y] = i;
				} else {
					i--;
				}
			}
			
			//출력
			for(int i = 0; i < bingo.length; i++) { //크기가 정해져있다면 length가 아닌 size를 써도 된다.
				for(int k = 0; k < bingo[i].length; k++) {
					System.out.print(bingo[i][k]);
					System.out.print("\t");
					
				}
				System.out.println("\n");
			}
		
	}

}
