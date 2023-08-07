<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 상품 목록</title>
</head>
<body>
	<h1>셔츠 상품 목록</h1>
	
	<h3><a href="add">신규 상품 등록</a></h3>
	
	<table border="1" width="700"> <!-- 1000을 넘어가면 모니터애 따라 잘릴 수 있다. 
	보통 사람들이 쓰는 모니터는 1000~1200 사이이다.  -->
		<thead align="center">
			<tr>
				<th width="15%">상품명</th>
				<th>색상</th>
				<th>가격</th>
				<th>종류</th>
				<th>유형</th>
			</tr>
		</thead>
		<tbody align="center">
			<c:forEach var="dto" items="${list}">
			<tr>
				<td><a href="detail?shirtNo=${dto.shirtNo}">
				${dto.shirtName}</a></td>
				<td>${dto.shirtColor}</td>
				<td>${dto.shirtPrice}</td>
				<td>${dto.shirtKind}</td>
				<td>${dto.shirtType}</td>
				<td><a href="delete?shirtNo=${dto.shirtNo}">상품삭제</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>