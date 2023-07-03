package oop.constructor2;

public class Test01 {

	public static void main(String[] args) {
		Music a = new Music
				("그때 그 순간 그대로(그그그)", "WSG워너비", "WSG워너비 1집", 104250L, 91835);
		Music b = new Music
				("보고싶었어", "WSG워너비","WSG워너비 1집", 83127L, 90805);
		Music c = new Music
				("LOVE DIVE", "IVE(아이브)", "LOVE DIVE", 64590L, 174519);
		Music d = new Music("POP!", "나연(TWICE", "IM NAYEON", 58826L, 70313 );
		
		Music e = new Music("애국가", null, null, 10000, 20000); 

		
		a.show();
		b.show();
		c.show();
		d.show();
		e.show();
	}

}
