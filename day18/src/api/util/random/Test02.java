package api.util.random;

import java.text.DecimalFormat;
import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		// 시드를 제어하여 랜덤을 조작하는 프로그래밍
		//= OTP(One Time Password)
		//= 검사하는 서버와 입력하는 사용자가 동일한 랜덤값을 가져야 한다.
		
		//서버
		String serial = "0000-0000-0000-0000";
		Random r = new Random();
		long seed = (System.currentTimeMillis() / 60000); // 1000은 1초
		seed += serial.hashCode();
		r.setSeed(seed);

		int otp = r.nextInt(1000000) + 0;
		DecimalFormat fmt = new DecimalFormat("000000");
		System.out.println("서버 = " + fmt.format(otp));

	}

}
