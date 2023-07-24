package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {
	
	public static void main(String[] args) {
		
		ProductDto dto = new ProductDto();
		
		dto.setName("냠냠");
		dto.setType("과자");
		dto.setPrice(1000);
		dto.setMade(Date.valueOf("2022-07-01")); //문자열-> Date
		dto.setExpire(Date.valueOf("2022-12-31"));//문자열-> Date
		
		ProductDao dao = new ProductDao();
		dao.insert(dto);
		
		System.out.println("등록 완료");
		

	}
}
