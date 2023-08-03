<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록 조회</title>
</head>
<body>
	<h1>도서 목록</h1>
	
	<table border="1" width="1000">
		<thead>
			<tr>
				<td>도서번호</td>
				<td>도서명</td>
				<td>저자</td>
				<td>출간일</td>
				<td>가격</td>
				<td>출판사</td>
				<td>쪽수</td>
				<td>장르</td>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="dto" items="${list}">
			<tr>
				<th>${dto.bookId}</th>
				<th><a href = "detail?bookId=${dto.bookId}">
				${dto.bookTitle}
				</a>
				</th>
				<th>${dto.bookAuthor}</th>
				<th>${dto.bookPublicationDate}</th>
				<th>$${dto.bookPrice}</th>
				<th>${dto.bookPublisher}</th>
				<th>${dto.bookPageCount}p</th>
				<th>${dto.bookGenre}</th>
			</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
</body>
</html>