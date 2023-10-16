package com.kh.spring17.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberComplexSearchVO { 
	private String memberId;
	private String memberNickname;
	private String memberEmail;
	private String memberContact;
	private String memberBirth;
	private List<String> memberLevelList;
	private Integer memberPointMin, memberPointMax; //null이 들어갈 수 있도록 Integer 사용
	private String memberJoinBegin, memberJoinEnd; //날짜도 검색할 때는 문자열로 입력
	//2023-10-01(00:00:00) 2023-10-16(23:59:59) 시간을 설정해줘야 함
	private String memberLoginBegin, memberLoginEnd;
	
	private List<String> orderList;
}
