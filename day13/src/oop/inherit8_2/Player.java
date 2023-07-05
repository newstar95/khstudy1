package oop.inherit8_2;

public abstract class Player {
	private String id;
	private int level;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level < 1) return;
		this.level = level;
	}
	
	public Player(String id) {
		this.id = id;
		this.level = 1;
	}
	
	public abstract void attack();
	public abstract void move();
	public abstract void store();
	
	public final void show() {
		System.out.println("<캐릭터 생성 정보>");
		System.out.println("아이디: " + this.id);
		System.out.println("레벨: " + this.level);
	}
	
}
