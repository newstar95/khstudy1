package com.kh.spring20.websocket;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

/*
	스프링에서 웹소켓 연결을 처리하는 도구(서버)
	- 상속을 통해 클래스를 구현 (WebSocketHandler / TextWebSocketHandler / BinaryWebSocketHandler)
	텍스트는 글자, 바이너리는 파일이 오고 갈 때 사용한다.
	상속 받은 다음 필요한 걸 고쳐쓰는 인터셉터와 비슷한 로직이다.
	- 등록하여 사용한다.
	- 스프링이 통신 관리는 전부 다 해주고, 진행 상태만 알려줌
	- afterConnectionEstablished는 통신이 연결된 이후 실행되는 메소드 (연결이 된 이후에 알려줌) / 사용자 접속을 알려준다.
	- afterConnectionClosed 통신이 종료된 이후 실행되는 메소드 (끊어진 이후에 알려줌)
	서버를 만든 것이 아닌 서버를 모니터하는 걸 만듬
	
	<웹소켓 서버 요약>
	1. 상속을 받는다.
	2. 등록을 한다.
	3. 필요한 메소드들을 재정의한다.
*/

@Slf4j
@Service
public class DefaultWebSocketServer extends TextWebSocketHandler {
	@Override
		public void afterConnectionEstablished(WebSocketSession session) throws Exception { 
			log.debug("사용자 접속!");
		}
	
	@Override
		public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
			log.debug("사용자 접속 종료");
		}
}
