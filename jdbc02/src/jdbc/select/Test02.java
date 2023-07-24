package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.ProductDto;
import jdbc.mapper.ProductMapper;
import jdbc.util.JdbcUtils;

public class Test02 {

	public static void main(String[] args) {
		
		String sql = "select * from product order by no asc"; //정렬은 빠져도 되고 들어가도 된다.
		//홀더가 없기 때문에 Object data = {}; 생략
		
		ProductMapper mapper = new ProductMapper();
		JdbcTemplate jabcTemplate = JdbcUtils.getJdbcTemplate();
		List<ProductDto> list = jabcTemplate.query(sql, mapper);
		
		for(ProductDto dto : list) {
			System.out.println(dto);
		}
		

	}

}
