package api.lang.test1;

import java.util.Properties;

public class Test02 {
	public static void main(String[] args) {
		//객체 생성
		Properties prop = new Properties();
		//기능 사용
		prop.setProperty("hello", "world");
		prop.setProperty("good", "bye");
		System.out.println(prop.toString());
		System.out.println(prop.getProperty("hello"));
		
	}
	
}
