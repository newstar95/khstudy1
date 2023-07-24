package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.ProductDto;

//spring RowMapper를 임포트 해야 함
//sql.date를 임포트 해야함

public class ProductMapper implements RowMapper<ProductDto> {

	@Override
	public ProductDto mapRow(ResultSet rs, int idx) throws SQLException {
		// rs의 내용을 ProductDto에 옮겨담는 코드를 작성
		ProductDto dto = new ProductDto(); //담을 수 있는 객체 생성
		
		 //데이터베이스 조회결과에서 name라는 컬럼의 값을 스트링형태로 꺼내겠다.
		dto.setNo(rs.getInt("no")); 
		dto.setName(rs.getString("name"));
		dto.setType(rs.getString("type"));
		dto.setPrice(rs.getInt("price"));
		dto.setMade(rs.getDate("made"));
		dto.setMade(rs.getDate("expire"));
		return dto;
	}

}
