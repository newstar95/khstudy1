package oop.test2;

public class Test01 {

	public static void main(String[] args) {
		//Pokemon의 객체(인스턴스)를 생성
		
		//생성
		Pokemon e = new Pokemon();
		Pokemon f = new Pokemon();
		Pokemon g = new Pokemon();
		Pokemon p = new Pokemon();
		
		//초기화
		e.name = "이상해씨";
		e.number = 1;
		e.attribute = "풀";
		
		f.name = "파이리";
		f.number = 4;
		f.attribute = "불꽃";
		
		g.name = "꼬부기";
		g.number = 7;
		g.attribute = "물";
		
		p.name = "피카츄";
		p.number = 25;
		p.attribute = "전기";
		
		//출력
		System.out.println(e.name);
		System.out.println(e.number);
		System.out.println(e.attribute);
		
		System.out.println(f.name);
		System.out.println(f.number);
		System.out.println(f.attribute);
		
		System.out.println(g.name);
		System.out.println(g.number);
		System.out.println(g.attribute);
		
		System.out.println(p.name);
		System.out.println(p.number);
		System.out.println(p.attribute);
		
		
		
		
		
	}

}
