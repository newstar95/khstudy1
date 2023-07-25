package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
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
	
	//수정(비밀번호)
	//- 1. 기존비밀번호와 신규비밀번호를 입력받아 검사 후 변경(권장하진 않음)
	//- 2. 임시 비밀번호 변경하는 기능
	//- 3. 아이디에 맞는 계정의 비밀번호를 변경하는 기능
	//public boolean updateMemberPassword(MemberDto dto, String newPw) { //1
	//public boolean updateMemberPassword(String memberId) { //2
	//public boolean updateMemberPassword(String memberId, String memberPw) { 
	public boolean updateMemberPassword(MemberDto dto) { //3
		String sql = "update member set member_pw=? where member_id=?";
		Object[] data = {dto.getMemberPw(), dto.getMemberId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql,data) > 0;
	}
	
	//수정(닉네임, 전화번호, 이메일, 생년월일)
	public boolean updateMemberInfo(MemberDto dto) {
		String sql = "update member set member_nickname=?, "
				+ "member_contact=?, member_email=?, member_birth=? where member_id=?";
		Object[] data = {dto.getMemberNinkname(), dto.getMemberContact(), dto.getMemberEmail(),
				dto.getMemberBirth(), dto.getMemberId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}

	public boolean delete(String id) {
		String sql = "delete member where member_id=?";
		Object[] data = {id};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}

	//Mapper
	private MemberMapper mapper = new MemberMapper();
	//회원 전체 목록 조회
	public List<MemberDto> selectList(){
		String sql = "select * from member";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper);
	}
	
	//회원 페이징 목록 조회
	public List<MemberDto> selectListByPage(int page, int size){
		int end = page * size;
		int begin = end - (size - 1);
		
		String sql = "select * from ("
				+ "select rownum rn, TMP.* from("
				+ "select * from member order by member_id desc"
				+ ")TMP"
				+ ") where rn between ? and ?";
		
		Object[] data = {begin, end};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper, data);
	}
	
	//상세
	public MemberDto selectOne(String memberId) {
		String sql = "select * from member where member_id=?";
		Object[] data = {memberId};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<MemberDto> list =  jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
		
	}
}
