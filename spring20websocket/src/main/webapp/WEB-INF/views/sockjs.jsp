<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>SockJS를 적용한 웹소켓 예제</h1>

<!-- 웹소켓 서버가 SockJS일 경우 페이지에서도 SockJS를 사용해야 한다. -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.1/sockjs.min.js"></script>

<script>
	//연결 생성
	//window.socket = new WebSocket(주소); //ws로 시작하는 주소
	window.socket = new SockJS("${pageContext.request.contextPath}/ws/sockjs"); //http로 시작하는 주소
	
	//연결 후 해야할 일들을 콜백함수로 지정(onopen, onclose, onerror, onmessage)
	window.socket.onmessage = function(e){ //서버에서 오는 메세지
		console.log(e);
	};
	
</script>