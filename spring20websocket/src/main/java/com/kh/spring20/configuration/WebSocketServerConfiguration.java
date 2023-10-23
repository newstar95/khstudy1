package com.kh.spring20.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import com.kh.spring20.websocket.DefaultWebSocketServer;
import com.kh.spring20.websocket.GroupWebSocketServer;
import com.kh.spring20.websocket.JsonWebSocketServer;
import com.kh.spring20.websocket.MemberWebSocketServer;
import com.kh.spring20.websocket.SockJsWebSocketServer;
import com.kh.spring20.websocket.TimeWebSocketServer;

//이 클래스는 생성한 웹소켓 서버를 어떤 주소에 할당하도록 설정하는 역할을 한다.
//스케줄러보다 서버에 더 무리가 가는 작업
@EnableWebSocket //기본적으로 잠겨 있다. 서버에 무리가 가기 때문
@Configuration
public class WebSocketServerConfiguration implements WebSocketConfigurer {

	@Autowired
	private DefaultWebSocketServer defaultWebSocketServer; //등록
	
	@Autowired
	private TimeWebSocketServer timeWebSocketServer; //주세요(의존성 주입)
	
	@Autowired
	private GroupWebSocketServer groupWebSocketServer;
	
	@Autowired
	private MemberWebSocketServer memberWebSocketServer;
	
	@Autowired
	private JsonWebSocketServer jsonWebSocketServer;
	
	@Autowired
	private SockJsWebSocketServer sockJsWebSocketServer;
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// 등록할 때는 주소와 도구를 연결해야 한다. (필요하다면 추가 옵션 설정)
		// (주의) 절대로 화면의 주소와 겹치면 안 된다.
		registry.addHandler(defaultWebSocketServer, "/ws/default") //defaultWebSocketServer, 어떤 주소에 연결하겠습니다를 작성(절대경로)
					.addHandler(timeWebSocketServer, "/ws/time")
					.addHandler(groupWebSocketServer, "/ws/group");
		
		//아래와 같이 등록하면 HttpSession의 정보를 WebSocketSession으로 옮겨준다.
		registry.addHandler(memberWebSocketServer, "/ws/member")
					.addHandler(jsonWebSocketServer, "/ws/json")
						.addInterceptors(new HttpSessionHandshakeInterceptor());
		
		//SockJS를 사용하는 웹소켓 서버는 뒤에 추가적인 설정을 해야 한다.
		//- 클라이언트도 이 웹소켓 서버에 연결하려면 SockJS를 사용해야 한다. (위 코드에 붙이면 원래 예제가 하나도 안 돌아감)
		registry.addHandler(sockJsWebSocketServer, "/ws/sockjs")
					.addInterceptors(new HttpSessionHandshakeInterceptor())
					.withSockJS();
		
	}

}
