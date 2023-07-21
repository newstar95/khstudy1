package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		//게좌 개설 프로그램
		//= 계좌를 개설한다는 것은 Account 테이블에 데이터를 Insert하는 것이다.
		Scanner sc = new Scanner(System.in);
		
		//데이터 준비
		System.out.print("예금주: ");
		String accountOwner = sc.next();
		System.out.print("예금기간(년): ");
		int accountPeriod = sc.nextInt();
		//int accountCount = accountPeriod * 12 + 1;
		int accountCount = 0;
		System.out.print("1회 예금액: ");
		int accountPayment  = sc.nextInt();
		int accountBalance  = 0;
		sc.close();
		
		//DB처리
		String sql = 
				"insert into account(account_owner, account_period, account_count, account_payment, account_balance) "
				+ "values(?, ?, ?, ?, ?)";
		
		Object[] data = {accountOwner, accountPeriod, accountCount, accountPayment, accountBalance};
		
		//달라지지 않는 구문
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); 
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemple = new JdbcTemplate(dataSource);
		jdbcTemple.update(sql, data);
		
		System.out.println("계좌가 개설되었습니다.");
		
	}
}
