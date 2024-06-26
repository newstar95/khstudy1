package jdbc.app;

import jdbc.dao.PocketmonDao;

public class Test12 {

	public static void main(String[] args) {
		// 포켓몬스터 삭제 프로그램
		//데이터가 하나밖에 없기 때문에 DTO가 필요 없다.
		
		//데이터
		int no = 43;
		
		//DB처리
		PocketmonDao dao = new PocketmonDao();
		boolean result = dao.delete(no);
		
		if(result) {
			System.out.println("포켓몬스터 정보 삭제 완료");
		} else {
			System.out.println("존재하지 않는 포켓몬스터 번호");
		}
	}

}
