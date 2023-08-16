<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>자유 게시판</h1>
<h2>타인에 대한 비방은 경고 없이 삭제됩니다</h2>

<table border="1" width="700">
	<thead>
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>조회수</th>
			<th>좋아요</th>
			<th>댓글수</th>
			<th>작성일</th>
			<th>수정일</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="boardDto" items="${list}">
		<tr>
			<td>${boardDto.boardNo}</td>
			<td>${boardDto.boardWriter}</td>
			<td>
				<a href = "detail?boardNo=${boardDto.boardNo}">
					${boardDto.boardTitle}
				</a>
			</td>
			<td>${boardDto.boardReadcount}</td>
			<td>${boardDto.boardLikecount}</td>
			<td>${boardDto.boardReplycount}</td>
			<td>${boardDto.boardCtime}</td>
			<td>${boardDto.boardUtime}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<h3><a href = "write">글쓰기</a></h3>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>