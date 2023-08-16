<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<h1>${boardDto.boardNo}번 게시글</h1>

<table border = "1" width = "700">
	<tr>
		<th>작성자</th>
		<td>${boardDto.boardWriter}</td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${boardDto.boardTitle}</td>
	</tr>
	<tr>
		<th height="200">내용</th>
		<td>${boardDto.boardContent}</td>
	</tr>
	<tr>
		<th>조회수</th>
		<td>${boardDto.boardReadcount}</td>
	</tr>
	<tr>
		<th>좋아요</th>
		<td>${boardDto.boardLikecount}</td>
	</tr>
	<tr>
		<th>댓글수</th>
		<td>${boardDto.boardReplycount}</td>
	</tr>
	<tr>
		<th>작성일</th>
		<td>${boardDto.boardCtime}</td>
	</tr>	
	<tr>
		<th>수정일</th>
		<td>${boardDto.boardUtime}</td>
	</tr>
</table>

<h3><a href = "edit?boardNo=${boardDto.boardNo}">수정하기</a></h3>
<h3><a href = "delete?boardNo=${boardDto.boardNo}">삭제하기</a></h3>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>