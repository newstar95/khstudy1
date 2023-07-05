package oop.inherit8;

public class Game {
	
	private String name;
	private int level;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level <  1) return;
		this.level = level;
	}
	
	//생성자 - 오직 아이디만 설정
	public Game(String name, int level) {
		this.setName(name);
		this.setLevel(1);
	}
	
	public Game(String name) {
		this(name, 1);
	}
	
	public void show() {
		System.out.println("<캐릭터 정보>");
		System.out.println("id: " + this.name);
		System.out.println("level: " + this.level);
	}

}
