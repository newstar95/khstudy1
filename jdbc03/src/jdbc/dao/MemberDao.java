package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.util.JdbcUtils;

public class MemberDao {
	//등록
	public void insert(MemberDto dto) {
//		String sql = "insert into member("
//						+ "member_id, member_pw, member_nickname,"
//						+ "member_birth, member_email, member_contact,"
//						+ "member_level, member_point, member_join"
//					+ ") values(?, ?, ?, ?, ?, ?, '일반', 0, sysdate)";
		String sql = "insert into member("
						+ "member_id, member_pw, member_nickname,"
						+ "member_birth, member_email, member_contact"
					+ ") values(?, ?, ?, ?, ?, ?)";
		Object[] data = {
			dto.getMemberId(), dto.getMemberPw(), 
			dto.getMemberNinkname(), dto.getMemberBirth(),
			dto.getMemberEmail(), dto.getMemberContact()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
}