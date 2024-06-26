package jdbc2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01 {

	public static void main(String[] args) {
		// 포켓몬스터 정보 수정(update)
		//= 포켓몬스터 항목은 총 3가지(no, name, type)
		//= 개별 항목만 변경할 수도 있고 다 바꿀 수도 있다.
		//= 반드시 한 개의 항목은 바꾸지 말아야 하며 일반적으로 PK가 불변
		
		//데이터 준비
		int no = 1;
		String name = "바꾼 이름";
		String type = "테스트";
		
		//생성될 구문은 다음과 같다.
		//set은 변화가 가능하나 where은 바뀌지 않는다.
		//데이터 베이스에서 다 수정하는 경우는 없다.
		//set이랑 where 사이에 콤마를 쓰지 않도록 주의해야 한다.
		String sql = "update pocketmon set name=?, type=? where no=?"; //수정의 가장 기본적인 구문
		Object[] data = {name, type, no};
		
		//실행 명령도 Insert와 동일하다.
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		jdbcTemple.update(sql, data);
		
		//진짜 완료가 되었는지 아닌지 알 수 없다.(바뀐 대상이 있는지...)
		//- update는 실행이 되었다고 반드시 바뀌었다고 볼 수 없다.
		//- 실제로 적용된 행의 개수를 알아내야 한다.
		//- update의 결과를 저장하여 확인 후 판정한다.
		int result = jdbcTemple.update(sql, data);
		System.out.println("result = " + result);
		
		if(result > 0) {
			System.out.println("임무 완료");
		} else {
			System.out.println("없는 번호");
		}

	}

}
