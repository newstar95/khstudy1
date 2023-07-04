package oop.keyword6;

public class Member {
	//필드
	private final String id;
	private String password;
	private String nickname;
	
	//메소드
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
//	public String getPasswordMasking() {
//		return "" + this.password.charAt(0) + this.password.charAt(1) + "**********";
//	}
	public String getPasswordMasking() {
		String total = "";
		for(int i=0; i < this.password.length(); i++) {
			if(i <= 1) {
				total += this.password.charAt(0);
			}
			else {
				total += "*";
			}
		}
		return total;
	}
	
	public void show() {
		System.out.println("<회원정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("비밀번호 : " + this.getPasswordMasking());
		System.out.println("닉네임 : " + this.nickname);
	}
	
	//생성자
	public Member(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}
	
}
