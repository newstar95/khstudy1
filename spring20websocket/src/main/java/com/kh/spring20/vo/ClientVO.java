package com.kh.spring20.vo;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

//웹소켓 통신에서 사용자를 조금 더 편하게 관리하기 위한 클래스
@Data 
@EqualsAndHashCode(of = "session") //session 필드가 동일하면 같은 객체라고 생각해라
@ToString(of = {"memberId", "memberLevel"}) //요약 정보에서 세션을 제거하게 함 // 출력할 때 작성한 항목만 출력해라!
public class ClientVO { 
	@JsonIgnore //Json으로 변환하는 과정에서 (입출력에서) 이 필드는 제외한다.
	private WebSocketSession session; 
	private String memberId, memberLevel; //비회원이라면 null일것
	
	public ClientVO(WebSocketSession session) { //무조건 session이 필요하기 때문에 생성자로 만듬
		this.session = session;
		Map<String, Object> attr = session.getAttributes();
		this.memberId = (String) attr.get("name"); //없으면 null이 들어가기 때문에
		this.memberLevel = (String) attr.get("level"); //문제가 안 됨
	}
	
	public boolean isMember() {
		return memberId != null && memberLevel != null; //사용자가 회원인지 아닌지 알 수 있음
	}
	
	public void send(TextMessage message) throws IOException {
		session.sendMessage(message);
	}
}
