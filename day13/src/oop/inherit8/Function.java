package oop.inherit8;

public abstract class Function extends Game {
	public Function(String name, int level) {
		super(name, level);
	}

	public abstract void attack();
	
	public abstract void move();
	
	public abstract void store();
}
