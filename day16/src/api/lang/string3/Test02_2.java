package api.lang.string3;

public class Test02_2 {

	public static void main(String[] args) {
		// 문자열 덧셈 성능 측정
		long start = System.currentTimeMillis(); //측정 시작
		// 실행이 되면 이때의 시간을 읽어와서 넣어주는 코드
		// 더하기가 편하라고 long 사용
		//빌더와 버퍼의 차이는 스레드 세이프의 유무
		//싱글 스레드 환경에서는 빌더가 효율적(잠금장치가 없어서)
		//멀티 스레드 환경에서는(여러 사용자가 각자 정해진 것을 하다보면...)
		//버퍼가 효율적(느리지만 안전) 
		//상황이 무슨 상황인지 잘 모를 때는 버퍼, 확신이 있다면 빌더
		//언제? 문자열을 계속 더해야 할때
		
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 100000000; i++) {
			builder.append("*");
		}
		
		String star = builder.toString();
		
		long finish = System.currentTimeMillis(); //측정 완료
		
		long time = finish - start;
		System.out.println("time = " + time);

	}

}
