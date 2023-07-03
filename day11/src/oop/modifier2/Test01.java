package oop.modifier2;

public class Test01 {

	public static void main(String[] args) {
		Bankbook a = new Bankbook("유재석", 3, 100, 1500);
		Bankbook b = new Bankbook("강호동", 2, 50, 250);
		Bankbook c = new Bankbook("신동엽", 2, 80, 1000);
		
//		Bankbook a = new Bankbook("유재석", 3, 1000000, 15000000);
//		Bankbook b = new Bankbook("강호동", 2, 500000, 2500000);
//		Bankbook c = new Bankbook("신동엽", 2, 800000, 10000000);
		
		a.show();
		b.show();
		c.show();
	}
}
