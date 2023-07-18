package api.file.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) throws IOException {
		//콘솔 메모장 프로그램
		File target = new File("sample/note.kh");
		
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력: ");
			String input = sc.nextLine();
				if(input.equals("종료")) {
					break;
				} else {
					bw.write(input);
					bw.write("\n");
					bw.flush();
					//flush()를 하면 즉시 저장이 됨
				}
			
		}
		sc.close();
	}

}
