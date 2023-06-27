package random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test02_1 {

	public static void main(String[] args) {
		Random r = new Random();
		
//		1. 무작위 로또 번호 1개
//		int lotto = 1부터 45개 중 하나;
		int lotto = r.nextInt(45) + 1;
		System.out.println("로또번호 = " + lotto);
		
//		2. 무작위 두 자리 정수 1개
//		int number = 10부터 90개 중 하나; 99 - 10 + 1
		int number = r.nextInt(90) + 10; 
		System.out.println("정수 = " + number);

		
//		3. 무작위 OTP 번호 1개(OTP 번호는 총 6자리로 구성되어 있습니다)
//		int otp = 00000 부터 999999 사이;
//		int otp = 0부터 1000000개;
//		int otp = r.nextInt(1000000) + 0;
		int otp = r.nextInt(1000000);
		System.out.println("OTP번호 = " + otp);

		
//		Format f = new DecimalFormat("000000");
//		System.out.println(f.format(otp));
		
//		4. 무작위로 앞/뒤 출력
//		(약속) 앞 = 0, 뒤 = 1
//		int coin = 0부터 2개 중 하나;
//		int coin = r.nextInt(2) + 0;
		int coin = r.nextInt(2);
		if (coin == 0) {
			System.out.println("동전 = 앞");
		} else {
			System.out.println("동전 = 뒤");
		}
		
		
//		5. 무작위로 가위/바위/보 출력
//		(약속) 가위 = 0, 바위 = 1, 보 = 2
//		int rsp = 0부터 3개 중 하나
		int rsp = r.nextInt(3) + 0;
		if (rsp == 0) {
			System.out.println("가위가 나왔습니다.");
		} else if (rsp == 1) {
			System.out.println("바위가 나왔습니다.");
		} else {
			System.out.println("보가 나왔습니다.");
		}
	}
}
