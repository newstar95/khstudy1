package oop.setter3;

public class Test01 {

	public static void main(String[] args) {
		Phone a = new Phone();
		Phone b = new Phone();
		Phone c = new Phone();
		Phone d = new Phone();
		
		a.setup("갤럭시23s", "SK", 180, 0);
		b.setup("갤럭시23s", "KT", 175, 24);
		c.setup("아이폰14", "LG", 200, 30);
		d.setup("아이폰14", "SK", 199, 0);
		
		a.show();
		b.show();
		c.show();
		d.show();

	}

}
