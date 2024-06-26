package jdbc.dto;

import java.sql.Date;

public class MemberDto {
	private String memberId;
	private String memberPw;
	private String memberNinkname;
	private String memberBirth;
	private String memberEmail;
	private String memberContact;
	private String memberLevel;
	private int memberPoint;
	private Date memberJoin;
	
	public MemberDto() {
		super();
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberNinkname() {
		return memberNinkname;
	}

	public void setMemberNinkname(String memberNinkname) {
		this.memberNinkname = memberNinkname;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberContact() {
		return memberContact;
	}

	public void setMemberContact(String memberContact) {
		this.memberContact = memberContact;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public int getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}

	public Date getMemberJoin() {
		return memberJoin;
	}

	public void setMemberJoin(Date memberJoin) {
		this.memberJoin = memberJoin;
	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberPw=" + memberPw + ", memberNinkname=" + memberNinkname
				+ ", memberBirth=" + memberBirth + ", memberEmail=" + memberEmail + ", memberContact=" + memberContact
				+ ", memberLevel=" + memberLevel + ", memberPoint=" + memberPoint + ", memberJoin=" + memberJoin + "]";
	}

}
