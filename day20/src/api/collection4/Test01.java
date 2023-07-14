package api.collection4;

import java.util.Stack;

public class Test01 {

	public static void main(String[] args) {
		// 이용방법이 정해져있는 저장소
		//Last In First Out (LIFO)
		
		Stack<String> stack = new Stack<>();
		
		
		//추가
		//add라고 해도 결과는 같으나 꼭 push를 써야한다.
		stack.push("구글");
		stack.push("네이버");
		stack.push("카카오");
		stack.push("KH정보교육원");
		
		//확인
		System.out.println(stack.peek()); //지금 가장 최신 데이터가 뭐냐? (현재 내가 어디있나)
		
		//제거
		stack.pop();
		System.out.println(stack.peek());//지금 가장 최신 데이터가 뭐냐?
		
		
		System.out.println(stack);
		
	}

}
