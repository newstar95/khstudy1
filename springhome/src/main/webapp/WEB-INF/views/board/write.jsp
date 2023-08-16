<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action ="write" method= "post" autocomplete="off" align="center">

<h1>게시글 작성</h1>
제목 <input name = "boardTitle" required><br><br>
내용 <textarea name = "boardContent" required></textarea><br><br>
<button>글쓰기</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>