package api.lang.string3;

public class Test02_1 {

	public static void main(String[] args) {
		// 문자열 덧셈 성능 측정
		long start = System.currentTimeMillis(); //측정 시작
		// 실행이 되면 이때의 시간을 읽어와서 넣어주는 코드
		// 더하기가 편하라고 long 사용
		
		
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < 100000000; i++) {
			buffer.append("*");
		}
		
		String star = buffer.toString();
		
		long finish = System.currentTimeMillis(); //측정 완료
		
		long time = finish - start;
		System.out.println("time = " + time);

	}

}
