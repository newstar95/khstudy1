package com.kh.spring17.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class MemberDto {
	private String memberId, memberPw, memberNickname, memberEmail, memberContact;
	private String memberBirth, memberPost, memberAddr1, memberAddr2, memberLevel;
	private int memberPoint;
	private Date memberJoin, memberLogin, memberChange; 
}
