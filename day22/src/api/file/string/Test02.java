package api.file.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException {
		// 문자열 출력
		//= 문자열 출력은 필연적으로 인코딩이 필요(분해)
		//= Writer 계열의 클래스를 사용하여 처리
		
		File directory = new File("sample");
		directory.mkdirs(); //폴더 생성
		
		//File target = new File("sample/string.sh"); //아래와 같은 것
		File target = new File(directory, "string.sh");
		
		//FileOutputStream stream = new FileOutputStream(target); 원래 하던 코드
		FileWriter fw = new FileWriter(target);
		
		//BufferedOutputStream buffer = new BufferedOutputStream(stream); 원래 하던 코드
		BufferedWriter bw = new BufferedWriter(fw);
		
		//출력
		//물론 버퍼가 다 차야 나감
		bw.write("Hello");
		bw.write("\n");
		bw.write("안녕하세요");
		bw.write("\n");
		bw.write("자바가 다 끝났어요");
		
		//정리
		//bw.flush();
		bw.close();
	}

}
