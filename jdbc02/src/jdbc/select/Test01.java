package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.PocketmonDto;
import jdbc.mapper.PocketmonMapper;
import jdbc.util.JdbcUtils;

public class Test01 {

	public static void main(String[] args) {
		// JDBC 조회(select)
		//테이블을 조회한 결과를 결과집합(ResultSet)이라고 한다.
		//- 두 가지 준비물이 필요하다.
		//- 첫 번째는 조회 결과 중 한 줄을 담을 객체(DTO)
		//- 두 번째는 조회 결과를 DTO에 옮겨 담는 방법을 가진 객체(Mapper)
		
		//기본 조회는 홀더(?)가 없다. 그러므로 미리 준비해놓을 데이터가 없다. (ex. Object[] data = {};)
		String sql = "select * from pocketmon order by no asc"; //기왕이면 정렬
		
		PocketmonMapper mapper = new PocketmonMapper();
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper);
		
		System.out.println("조회 결과: " + list.size()); 
		//리스트는 반복문 가능
		for(PocketmonDto dto : list) {
			System.out.println(dto);
		}

	}

}
