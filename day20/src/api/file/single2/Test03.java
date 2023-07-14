package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	
	public static void main(String[] args) throws IOException {
		
	File readTarget = new File("D:/origin.txt");
	FileInputStream readStream = new FileInputStream(readTarget);
	
	File writeTarget = new File("./sample/copy2.txt");
	FileOutputStream writeStream= new FileOutputStream(writeTarget);
	
	byte[] buffer = new byte[127];
	
	while(true) {
		int a = readStream.read();
		if(a == -1) break;
			writeStream.write(a);
		}

	}
	
}
