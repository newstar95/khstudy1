package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03_1 {
	
	public static void main(String[] args) throws IOException {
		
	File readTarget = new File("D:/origin.txt");
	FileInputStream readStream = new FileInputStream(readTarget);
	
	File writeTarget = new File("./sample/copy2.txt");
	FileOutputStream writeStream= new FileOutputStream(writeTarget);
	
	byte[] buffer = new byte[100];
	
	long count = 0L;
	long total = readTarget.length();
	DecimalFormat fmt = new DecimalFormat("#,##0.00");
	
	while(true) {
		int a = readStream.read();
		if(a == -1) break;
			writeStream.write(a);
			count++;
			
			double percent = count * 100d / total;
			System.out.println(count + "/" + total + "(" + fmt.format(percent) + "%)");
		}

	//정리
	readStream.close();
	writeStream.close();

	}
	
}
