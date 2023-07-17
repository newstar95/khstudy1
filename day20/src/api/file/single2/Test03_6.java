package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03_6 {

	public static void main(String[] args) throws IOException {
		// 파일 복사 프로그램(바이트 배열 - 버퍼 사용)
		
		//배열 준비
		byte[] buffer = new byte[10];
		
		//대상 준비 (운영체제가 거부하는 위치인 경우
		String home = System.getProperty("user.home");
		File readTarget = new File("home", "나머지 경로"); //sample/origin.zip
		File writeTarget = new File("home", "나머지 경로"); //sample/copy.zip
		
		//스트림 준비
		FileInputStream readStream = new FileInputStream(readTarget);
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
		
		//[읽을 파일] -> readTarget ->  readStream -> [프로그램] 
		//	-> writeStream -> writeTarget -> [내보낼파일]
		
		//시간을 재는 두 번째 방법(첫 번째 방법은 시간이 더 걸린다)
		long start = System.currentTimeMillis();
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		while (true ) {
			int size = readStream.read(buffer);
			if(size == -1) break;
			writeStream.write(buffer, 0, size);;
		
		}
		long finish = System.currentTimeMillis();
		long duration = finish - start;
		System.out.println("소요시간: " + duration + "ms");
		
		//파일 통로 정리
		writeStream.close();
		readStream.close();

	}

}
