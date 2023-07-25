package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.PocketmonDto;
import jdbc.mapper.PocketmonMapper;
import jdbc.util.JdbcUtils;

//DAO 클래스
//= Data Access Object. DB 담당 처리반 
//= 내가 뭔가를 주문했을 때 가지고 오는 게 목적(데이터 베이스를 접속하는)
//= 해당 테이블에 필요한 기능들을 '메소드'로 구현
//= 기본적으로 C(등록), R(목록), R(상세), U(수정), D(삭제)가 필요 
public class PocketmonDao {
	//C(등록) 메소드
	public void insert(int no, String name, String type) {
		String sql = "insert into pocketmon(no, name, type) "
				+ "values(?, ?, ?)";
		
		Object[] data = {no, name, type};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
		
	}

	
	//바람직한 형태의 등록 메소드
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon(no, name, type) "
				+ "values(?, ?, ?)";
		
		Object[] data = {dto.getNo(), dto.getName(), dto.getType()};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
	//U(수정) 메소드
	//- no를 이용해서 name과 type을 바꾼다.
	//데이터를 DTO로 묶어서 보는 능력과 DTO와 ListDto를 구별하는 능력이 필요
	//- 적용된 행이 있는지 없는지를 알아야 한다.

	//수정이 됐는지 꼭 확인을 하기 위해 Boolean
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon set name=?, type=? where no=?";
		Object[] data = {
				dto.getName(), dto.getType(), dto.getNo()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql, data); 
		
//	if (result > 0)return true; //result가 0보다 크면 참 
//	else return false; //아니면 거짓을 반환해라
		
		return result > 0; //result가 0보다 큰지 판정해서 반환해라
			
	}

	
	//D(삭제) 메소드
	//- 삭제 메소드는 Primary key(기본키)를 이용하여 하나씩 지운다.
	//- 조건에 따라서 삭제가 안될 수 있기 때문에 결과를 반환해야 한다.
	public boolean delete(int no) {
		String sql = "delete pocketmon where no=?";
		Object[] data = {no};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}

	
	//Mapper는 외부에 필드로 생성
	private PocketmonMapper mapper = new PocketmonMapper();
	
	
	//R(조회) 메소드
	//- 여러 개의 데이터가 나오는 구문
	//- 자바에서는 List<DTO> 형태로 취급
	//	조회하려면 Mapper가 필요
	public List<PocketmonDto> selectList(){
		String sql = "select * from pocketmon";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper);
	}
	
	
	//R(상세) 메소드
	//- Primary key를 이용하여 하나의 결과만 나오는 구문
	//- 자바에서는 DTO 형태로 취급
	//public PocketmonDto selectOne(PocketmonDto dto){
	public PocketmonDto selectOne(int no) {
		String sql = "select * from pocketmon where no=?";
		Object[] data = {no};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper,data);
		if (list.isEmpty()) {
			return null;
		} else {
			return list.get(0);
		}
	}

}
