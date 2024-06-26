package api.file;

import java.io.File;

public class Test01 {

	public static void main(String[] args) {
		// 파일(File) 제어
		//- 파일은 무엇인가?	글자를 저장하는 저장소
		//								파일이 크다는 것은 보관하는 글자가 많다는 소리
		//								글자 하나 당 1byte(자바에서 byte로 사용)
		// - 폴더는 무엇인가?	파일을 구분하기 위한 장치
		//								디렉토리(directory)라고 부름
		//								크기가 없음(내부 파일의 합계)
		//- 자바에서 파일과 폴더는 어떻게 처리하는가?
		//								java.io 패키지 (블로킹 방식)
		//								java.nio 패키지 (논블로킹 방식)
		
		
		//File 클래스 객체 생성
		File a = new File("D:/test.txt"); 
		File b = new File("D:/", "test.txt");
		
		//파일 정보 분석
		System.out.println(a.exists());
		System.out.println(b.exists());
		
		System.out.println("");
		
		System.out.println(a.isFile()); //파일이야?
		System.out.println(a.isDirectory()); //디렉토리야?
		
		if(a.isFile()) {
			System.out.println(a.getName()); //이름이 뭐야?
			System.out.println(a.getPath()); //위치가 어디야?
			System.out.println(a.length()); //파일의 크기(=들어있는 글자의 개수) 반환형이 long이다.
			
			System.out.println(a.lastModified()); //최종 수정시각이 언제야? 
		}
		
		//디렉터리도 File 클래스로 제어한다.
		//요즘은 이스케이프문자를 두 개씩 쓰는 것이 번거로워서 windows라도 mac버전으로 사용한다.
		File c = new File("D:/"); // mac 버전
		File d = new File("D:\\"); //windows 버전
		
		if(c.isDirectory()) {
			System.out.println(c.getName());
			System.out.println(c.getPath());
			System.out.println(c.length()); //(주의) 디렉터리의 크기는 의미가 없다.
		}
		
		//디렉터리는 내부에 존재하는 요소들을 추출할 수 있다.
		String[] names = c.list(); //이름만 추출
		File[] files = c.listFiles(); //파일 객체를 추출(이름+나머지 정보)
		
		for(File file: files) {
			System.out.println(file);
		}
		
		
		

	}

}
