package api.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		// 비선형구조
		
		//Set(인터페이스)
		//= 중복이 발생할 수 없는 구조
		//= 트리 구조면 TreeSet, 해시 구조면 HashSet
		
		Set<Integer> a = new TreeSet<>();
		Set<Integer> b = new HashSet<>();
		
		//추가
		a.add(30);		b.add(30);
		a.add(50);		b.add(50);
		a.add(20);		b.add(20);
		a.add(10);		b.add(10);
		a.add(40);		b.add(40);
		
		System.out.println(" a = " + a);
		System.out.println(a.size());
		System.out.println("b = " + b);
		
		//검색
		//(Q) a에 40이 있습니까?
		
		//삭제
		//(Q) b에서 50을 삭제하세요.
		System.out.println(a.contains(40));
		System.out.println(b.remove(50));
		
		//.get()은 없음 - Set에는 index 개념이 없다
		
	}

}
