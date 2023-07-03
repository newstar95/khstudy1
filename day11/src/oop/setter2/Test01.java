package oop.setter2;

public class Test01 {
	public static void main(String[] args) {
		
		Academy a = new Academy(); 
		Academy b = new Academy(); 
		Academy c = new Academy(); 
		
		
		a.setup("자바 마스터과정", 90, 1000000, "온라인");
		b.setup("파이썬 기초", 60, 600000, "온라인");
		c.setup("웹 개발자 단기 완성", 120, 1200000, "오프라인");
		
		a.show();
		b.show();
		c.show();
		
	}
	
}
