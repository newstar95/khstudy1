package api.lang.string2;

import java.util.regex.Pattern;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberLevel;
	private int memberPoint;
	
	public Member(String memberId, String memberPw, String memberName, String memberLevel, int memberPoint) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberLevel = memberLevel;
		this.memberPoint = memberPoint;
	}
	
	public Member(String memberId, String memberPw, String memberName) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberLevel = "일반회원";
		this.memberPoint = 100;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,20}$";
		if (memberId.matches(regex)) {
			this.memberId = memberId;
			} else {
				return;
			}
		}
	
	public String getMemberPw() {
		return memberPw;
	}
	
	public void setMemberPw(String memberPw) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$";
		if(memberPw.matches(regex)) {
			this.memberPw = memberPw;
		} else {
			return;
		}
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		String regex = "^[가-힣]{2,7}$";
		if(memberName.matches(regex)) {
			this.memberName = memberName;
		} else {
			return;
		}
	}
	
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		switch(memberLevel) {
		case "관리자": case "우수회원" : case "일반회원" :
		this.memberLevel = memberLevel;
		}
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		if (memberPoint < 0) return;
		this.memberPoint = memberPoint;
	}
	
	public void show() {
		System.out.println("<회원 가입 프로그램>");
		System.out.println("회원 아이디: " + this.memberId);
		System.out.println("회원 비밀번호: " + this.memberPw);
		System.out.println("회원 이름: " + this.memberName);
		System.out.println("회원 등급: " + this.memberLevel);
		System.out.println("회원 포인트: " + this.memberPoint + "점");
	}

}
