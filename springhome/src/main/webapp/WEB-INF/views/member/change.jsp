<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${param.error != null}">
	<h3>입력하신 비밀번호가 일치하지 않습니다.</h3>
</c:if>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>개인 정보 변경</h1>

<form action="change" method="post" autocomplete="off" align="center">

	닉네임 <input type="text" name="memberNickname" value="${memberDto.memberNickname}" required><br><br>
	이메일 <input type="email" name="memberEmail" value="${memberDto.memberEmail}"><br><br>
	연락처 <input type ="tel" name="memberContact" value="${memberDto.memberContact}"><br><br>
	생년월일 <input type="date" name="memberBirth" value="${memberDto.memberBirth}"><br><br>
	주소<br>
	<input type="text" name="memberPost" placeholder="우편번호" size="6" maxlength="6"
	 value="${memberDto.memberPost}"><br><br>
	<input type="text" name="memberAddr1" placeholder="기본주소" size="50"t
	 value="${memberDto.memberAddr1}"><br><br>
	<input type="text" name="memberAddr2" placeholder="상세주소" size="50"
	value="${memberDto.memberAddr2}"><br><br>
	비밀번호 확인 <input type="password" name="memberPw">
	
	<button>변경하기</button>
	
</form>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>