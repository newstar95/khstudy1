package oop.inherit8;

public class Archer extends Function {

	public Archer(String name, int level) {
		super(name, level);
	}
	
	public Archer(String name) {
		super(name, 1);
	}
	
	@Override
	public void attack() {
		System.out.println("궁수가 활로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("궁수가 숨어서 이동합니다!");
	}

	@Override
	public void store() {
		System.out.println("궁수가 상점을 개설합니다!");
	}

}
