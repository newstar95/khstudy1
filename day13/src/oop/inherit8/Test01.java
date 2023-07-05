package oop.inherit8;

public class Test01 {

	public static void main(String[] args) {
		Warrior w = new Warrior("www");
		w.show();
		w.attack();
		w.move();
		w.store();
		
		Magician m = new Magician("mmm");
		m.show();
		m.attack();
		m.move();
		m.store();
		
		Archer a = new Archer("aaa");
		a.show();
		a.attack();
		a.move();
		a.store();
	}
}
