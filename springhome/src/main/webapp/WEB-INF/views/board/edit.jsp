<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action ="edit" method= "post" autocomplete="off" align="center">

<h1>게시글 수정</h1>
<input type ="hidden" name="boardNo" value="${boardDto.boardNo}"><br><br>
제목 <input name = "boardTitle" value="${boardDto.boardTitle}"><br><br>
내용 <textarea name = "boardContent" >${boardDto.boardContent}</textarea><br><br>
<button>수정하기</button>
</form>

<a href="list">돌아가기</a>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>