package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {
	public static void main(String[] args) {
		//상품 등록 프로그램
		
		//데이터 준비
		ProductDto dto = new ProductDto();
		dto.setName("테스트");
		dto.setType("주류");
		dto.setPrice(5000);
		dto.setMade(Date.valueOf("2022-07-01"));//문자열 -> Date
		dto.setExpire(Date.valueOf("2022-12-31"));//문자열 -> Date
		
		//DB처리
		ProductDao dao = new ProductDao();
		dao.insert(dto);
		
		System.out.println("상품 등록 완료");
	}
}