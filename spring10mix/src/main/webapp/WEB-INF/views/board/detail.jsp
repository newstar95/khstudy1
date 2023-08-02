<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.boardNo}번 게시글</title>
</head>
<body>

	<c:choose>
		<c:when test="${dto.boardNo != null}">
		<h1>게시글 제목 ${dto.boardTitle}</h1>
		<h2>게시글 내용 ${dto.boardContent}</h2>
		<h2>작성자 ${dto.boardWriter}</h2>
		<h3>조회수 ${dto.boardReadcount}</h2>
		</c:when>
		
		<c:otherwise>
		<h1>게시글이 존재하지 않습니다.</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>