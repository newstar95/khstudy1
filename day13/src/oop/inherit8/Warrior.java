package oop.inherit8;

public class Warrior extends Function {

	public Warrior(String name,int level) {
		super(name, level);
	}

	public Warrior(String name) {
		super(name, 1);
	}
	
	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}

	@Override
	public void store() {
		System.out.println("전사가 상점을 개설합니다!");
	}

}
