<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<h1>상품 목록</h1>
	<h3><a href="add">신규 상품 등록</a></h3>
	<table border="1" width="700">
		<thead align="center">
			<tr>
				<th width="10%">상품번호</th>
				<th width="15%">상품명</th>
				<th>색상</th>
				<th>판매가</th>
				<th>종류</th>
				<th>유형</th>
				<th>재질</th>
				<th width="10%">판매수량</th>
				<th></th>
			</tr>
		</thead>
		<tbody align="center">
			<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.shirtNo}</td>
				<td><a href="detail?shirtNo=${dto.shirtNo}">
				${dto.shirtName}</a></td>
				<td>${dto.shirtColor}</td>
				<td>${dto.shirtPrice}</td>
				<td>${dto.shirtKind}</td>
				<td>${dto.shirtType}</td>
				<td>${dto.shirtMaterial}</td>
				<td>${dto.shirtStock}</td>
				<td><a href="delete?shirtNo=${dto.shirtNo}">상품삭제</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>