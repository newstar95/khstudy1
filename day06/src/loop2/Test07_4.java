package loop2;

public class Test07_4 {

	public static void main(String[] args) {
		int pushUp = 10; //시작은 10개 (추천)
		int total = 0;
		
		for(int day = 1; day <= 30; day++) {
//			System.out.println(day + "일차:" + pushUp + "개");
			total += pushUp; // total을 pushUp 개수만큼 증가 처리
			pushUp += 3; //3개씩 증가
		}
		System.out.println("총 푸시업 개수 = " + total);
	}
}
