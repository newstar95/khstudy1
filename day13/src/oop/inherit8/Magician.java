package oop.inherit8;

public class Magician extends Function {

	public Magician(String name, int level) {
		super(name, level);
	}
	
	public Magician(String name) {
		super(name, 1);
	}

	@Override
	public void attack() {
		System.out.println("마법사가 마법으로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("마법사가 텔레포트로 이동합니다!");
	}

	@Override
	public void store() {
		System.out.println("마법사가 상점을 개설합니다!");
	}

}
