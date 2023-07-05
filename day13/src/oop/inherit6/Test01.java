package oop.inherit6;

public class Test01 {

	public static void main(String[] args) {
		Galaxy23s g1 = new Galaxy23s("010-1111-1111", "blue");
		GalaxyFold4 g2 = new GalaxyFold4("010-2222-2222", "black");
		IPhone13 i1 = new IPhone13("010-3333-3333", "yellow");
		IPhone14 i2 = new IPhone14("010-4444-4444", "green");
		
		g1.show();
		g1.call();
		g1.sms();
		g1.samsungPay();
		g1.bixby();
		
		g2.show();
		g2.call();
		g2.sms();
		g2.samsungPay();
		g2.iris();
		
		i1.show();
		i1.call();
		i1.sms();
		i1.siri();
		i1.itunes();
		
		i2.show();
		i2.call();
		i2.sms();
		i2.siri();
		i2.faceTime();
	}

}
