package oop.inherit3;

public class Browser {
	
	private String uri;
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void refersh() {
		System.out.println("새로고침 기능 실행");
	}
	
	public void move() {
		System.out.println("페이지 이동 기능 실행");
	}
}
