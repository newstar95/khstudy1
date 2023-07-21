package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08 {

	public static void main(String[] args) {
		//회원 가입 프로그램
		
		//데이터 - 6개(아이디, 비밀번호, 닉네임, 생년월일, 이메일, 연락처)
		//(TIP) 오라클에 추가하는 문자열이든 null이든 ""이든 모두 null로 추가됨.
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String memberId = sc.next();
		System.out.print("비밀번호: ");
		String memberPw = sc.next();
		System.out.print("닉네임: ");
		String memberNickname = sc.next();
		System.out.print("생년월일: ");
		String memberBirth = sc.next();
		System.out.print("이메일: ");
		String memberEmail = sc.next();
		System.out.print("전화번호: ");
		String memberContact = sc.next();
		sc.close();
		
//		String sql = "insert into member(member_id, member_pw, member_nickname, member_birth,"
//				+ "member_email, member_contact, member_level, member_point, member_join) "
//				+ "values(?, ?, ?, ?, ?, ?, '일반', 0, sysdate)";

		String sql = "insert into member(member_id, member_pw, member_nickname, member_birth,"
				+ "member_email, member_contact, member_level, member_point, member_join) "
				+ "values(?, ?, ?, ?, ?, ?)";
		
		Object[] data = {memberId, memberPw, memberNickname, memberBirth, memberEmail, 
				memberContact};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, data);
		
		System.out.println("회원이 생성되었습니다.");
		
	}

}
