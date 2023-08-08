<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>

	<form action="edit" method="post">
	<h2>${dto.boardNo}번 게시글 수정</h2>
	
	<input type ="hidden" name="boardNo" value="${dto.boardNo}">
	제목 <input type="text" name = "boardTitle" value="${dto.boardTitle}"><br>
	<textarea name = "boardContent">${dto.boardContent}</textarea><br>
	
	<button>수정완료</button>
	</form>
	<a href="list">돌아가기</a>

</body>
</html>