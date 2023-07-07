package api.lang.string2;

public class Test04 {

	public static void main(String[] args) {
		
		String id = "aabb1122";
		String regex = "^[a - z][a-z0-9\\-_]{4,19}$";
		
		boolean isValid = id.matches(regex);
		
		if (isValid) {
			System.out.println("유효한 아이디입니다.");
		} else {
			System.out.println("잘못된 아이디입니다.");
		}
	}

}
//계산식에 역슬러시쓰면 이스케이프 문자와 같은 역할