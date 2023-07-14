package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램
		
		//준비물 : 입력용 파일 + 스트림, 출력용 파일 + 스트림
		
		File readTarget = new File("D:/origin.txt"); //절대경로
		FileInputStream readStream = new FileInputStream(readTarget);
		
		File writeTarget = new File("./sample/copy.txt");
		FileOutputStream writeStream = new FileOutputStream(writeTarget); //상대경로
		
		//한 글자만 복사
		int a = readStream.read();
		writeStream.write(a);
		
		//정리
		readStream.close();
		writeStream.close();
			

	}

}
