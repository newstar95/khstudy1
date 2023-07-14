package api.file;

import java.io.File;

public class Test02 {

	public static void main(String[] args) {
//		String input = "D:/JSB/study"; //폴더
		String input = "D:/test.txt"; //파일
//		String input = "D:/JSB/study2"; // 존재하지 않는 대상
		
		//분석을 하려면 파일 객체를 생성해야함
		File a = new File(input);
		
		if (a.isFile()){ //파일이면 이름+확장자+크기
			System.out.println("<파일정보>");
			System.out.println("이름: " + a.getName());
			
			//확장자는 파일의 마지막 . 뒤에 있는 값을 말하며, 없을 수 있다.
			//(ex) abc.def.ghi 이면 확장자는 .ghi이다.
			int index = a.getName().lastIndexOf(".");
			String extension;
			if (index == -1) {
				extension = "없음";
			} else {
				extension = a.getName().substring(index);
			}
			System.out.println("확장자: " + extension);
			System.out.println("크기: " + a.length() + " bytes");
			
		} else if(a.isDirectory()) { //디렉터리면 목록[파일/폴더]
			File[] list = a.listFiles();
			for(File file : list) {
				if(file.isFile()) {
					System.out.print("[파일]");
				} else if(file.isDirectory()) { //else해도 됨
					System.out.print("[폴더]");
				}
				System.out.println(file.getName());
			}
		} else {
			System.out.println("존재하지 않는 파일 또는 폴더");
		}

	}

}
