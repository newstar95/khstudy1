package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03_2 {

	public static void main(String[] args) {
		//투표함 만들기
		Map<String, Integer> tv = new HashMap<>();
		
		//샘플 데이터 추가
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			//사용자가 투표한 내용을 투표함에 반영
			System.out.print("이름 입력:" );
			String name = sc.next();
			
			if (name.equals("종료")) {
				break;
			} 
			
			name = name.replace("", "").toLowerCase(); 
			//이름에 공백이 들어간 경우를 해결, 소문자대문자 다르게 한 경우 해결
			
			Integer count = tv.get(name); //이름에 대한 득표수 추출
			if (count == null) { //득표수가 null이라면(이름이 없다면)
				tv.put(name,  1);//득표수 1로 등록
			} 
			else { //아니면
				tv.put(name, count+1);//득표수 1증가 처리
			}
			//출력
			System.out.println("["+name+"] 현재 득표수 " + tv.get(name));
		}
		sc.close();
		System.out.println(tv);
	}

}
