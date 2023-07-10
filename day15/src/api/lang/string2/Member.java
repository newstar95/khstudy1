package api.lang.string2;

import java.util.regex.Pattern;

public class Member {
	
	private String memberId; //회원아이디
	private String memberPw; //회원비밀번호
	private String memberName; //회원이름
	private String memberLevel; //회원등급(기본값 일반회원)
	private int memberPoint; //회원포인트(기본값 100점)
	
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
//		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,20}$";
		if(memberId.matches("^[A-Za-z0-9]{8,20}$")) {
			this.memberId = memberId;
		}
	}
	
	public String getMemberPw() { //얘를 바꾸면 안됨, 마스킹하기 싫을 떄는 비밀번호를 못 구해옴
		return memberPw;
	}
	
	public String getMemberPwMasking() {
		return this.memberPw.substring(0,2) +
				"*".repeat(this.memberPw.length()-2);
	}
	
	public void setMemberPw(String memberPw) { //반드시 한 개라는 조건
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
		String regex = "^[가-힣]{2,7}$"; //^[가-힣]{1,2}[가-힣]{1,5}$ 성따로이름따로
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
//		if(memberLevel.matches("^(관리자|우수회원|일반회원)$"){
//			this.memberLevel = memberLevel;
//		}
		this.memberLevel = memberLevel;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		if (memberPoint < 0) return;
		this.memberPoint = memberPoint;
	}
	
	public void show() {
		System.out.println("<회원가입 정보>");
		System.out.println("회원 아이디: " + this.memberId);
		System.out.println("회원 비밀번호: " + this.getMemberPwMasking());
		System.out.println("회원 이름: " + this.memberName);
		System.out.println("회원 등급: " + this.memberLevel);
		System.out.println("회원 포인트: " + this.memberPoint + "점");
	}

}
