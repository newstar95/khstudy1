<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<h1>회원 탈퇴</h1>
	<h2>탈퇴를 위한 정보를 입력해주세요.</h2>
	<form action = "http://localhost:8080/member/exit" method = "post">
	<!-- 회원의 모든 기능의 핵심은 비밀번호이다. -->
	아이디 <input type = "text" name = "memberId" required> 
	비밀번호 <input type = "password" name = "memberPw" required> 
	<button>탈퇴하기</button>
	</form>
</body>
</html>