<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<h1>게시글 작성</h1>
	<!-- 
	작성자
	글제목
	내용
	여러줄 입력창(textarea)으로 처리 (rows=줄수, cols=칸수)
ㄴ	 -->
	 <form action="http://localhost:8080/insert">
	 글 제목: <input name="boardTitle"><br>
	 글 내용: <textarea name="boardContent" rows="10" cols="100"></textarea><br>
	 글쓴이: <input name="boardWriter"><br>
	 <button>등록</button>
	 </form>

</body>
</html>