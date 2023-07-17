package single2;

import java.io.File;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) throws IOException {


//		파일 삭제는 가능하지만 디레거리는 비어있는 것만 삭제가 가능
		
		File a = new File("\"D:/origin.zip\""); 
		File b = new File("\"D:/copy/copy.zip\""); 
		
//		File a = new File("D:/test");
//		File b = new File("D:/test2");
		
		FileUtil.copy(a, b);
	}

}
