package oop.inherit3;

public class Test01 {

	public static void main(String[] args) {
		//Browser는 생성하면 안된다.
		
		Chrome a = new Chrome();
		Edge b = new Edge();
		Whale c = new Whale();
		
		a.setUri("www.gogle.com");
		a.refersh();
		a.move();
		a.develop();
		a.chromeStore();
		
		b.setUri("www.gogle.com");
		b.refersh();
		b.move();
		b.fullScreen();
		
		c.setUri("www.gogle.com");
		c.refersh();
		c.move();
		c.papago();
		c.naverSearch();
		
	}

}
