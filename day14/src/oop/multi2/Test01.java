package oop.multi2;

public class Test01 {
	
	public static void main(String[] args) {
		Drone d = new Drone();
		Airplane a = new Airplane();
		Train t = new Train();
		Bus b = new Bus();
		Kickboard k = new Kickboard();
		
		Electronic dd = new Drone(); //업캐스팅
		//Q. 전자제품인 객체를 출력해봐라.
		
		
		d.move();
		d.On();
		d.Off();
		d.fly();
		
		a.move();
		a.fly();
		a.reservation();
		
		t.move();
		t.reservation();
		
		b.move();
		
		k.move();
		k.On();
		k.Off();
		
		
	}
	
}

