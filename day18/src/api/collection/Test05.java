package api.collection;

import java.util.ArrayList;

public class Test05 {

	public static void main(String[] args) {
		// 그 외 알아야 할 List의 명령들
		ArrayList<String> list = new ArrayList<>();
		
		list.add("피카츄");
		list.add("라이츄");
		list.add("파이리");
		list.add("꼬부기");
		
		//순서가 있으므로 중간에 삽입할 수 있다.
		list.add(1, "버터플"); //index 1
		
		//출력
		System.out.println(list);
		
		//위치를 알면 해당 위치의 데이터를 추출할 수 있다.
		System.out.println(list.get(0)); //index 0의 데이터를 가져와라
		System.out.println(list.get(1)); //index 1의 데이터를 가져와라
		System.out.println(list.get(2)); //index 2의 데이터를 가져와라
		System.out.println(list.get(3)); //index 3의 데이터를 가져와라
		System.out.println(list.get(4)); //index 4의 데이터를 가져와라
//		System.out.println(list.get(5)); 범위초과
		
		System.out.println("==================");
		for(int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
			
		}
		System.out.println("==================");
		
		//확장 반복(foreach) 구문
		//= 전체반복에 특화된 반복문
		for(String name : list) {
			System.out.println(name); //단점은 일부분만 보여줄 수 없다
														//꺼낼 때만 가능
		}

	}

}
