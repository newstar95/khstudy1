package oop.poly1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int type = num1;
		int action = num2;
		
		System.out.println("노트북을 먼저 선택하세요." );
		System.out.print("1.맥북 2.갤럭시북 : ");
		
		NoteBook notebook;
		if(type == 1) {
			notebook = new MacBook(); //MacBook -> NoteBook(업캐스팅)
		} else {
			notebook = new GalaxyBook(); //GalaxyBook -> NoteBook(업캐스팅)
		}
		
		//notebook에 들어간 객체의 기능을 실행
		if(action == 1) {
			notebook.power();
		} else if(action == 2) {
			notebook.video();
		} else {
			notebook.typing();
		}
		sc.close();
	}
	
}
