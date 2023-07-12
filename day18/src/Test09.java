import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test09 {

	public static void main(String[] args) {
		// ArrayList 말고 다른 List의 종류
		//- ArrayList는 데이터가 배열 형태로 존재하는 리스트
		//-LinkedList는 데이터가 연결 형태로 존재하는 리스트

		
		List<String> a = new ArrayList<>();
		List<String> b = new LinkedList<>();
		
		a.add("자바");		b.add("자바");
		a.add("파이썬");	b.add("파이썬");
		a.add("노드");		b.add("노드");
		
		System.out.println("a = " + a);
		System.out.println("a = " + b);
		
	}

}
