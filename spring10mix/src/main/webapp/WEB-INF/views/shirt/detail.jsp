<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.shirtNo}번 셔츠 정보</title>
</head>
<body>
	<c:choose>
		<c:when test="${dto != null}">
			<h1>${dto.shirtNo}번 셔츠 정보</h1>
			<table border="1" width="400">
				<tr>
					<th width="30%">상품명</th>
					<td>${dto.shirtName}</td>
				</tr>
				<tr>
					<th>색상</th>
					<td>${dto.shirtColor}</td>
				</tr>
				<tr>
					<th>판매가</th>
					<td>${dto.shirtPrice}원</td>
				</tr>
				<tr>
					<th>종류</th>
					<td>${dto.shirtKind}</td>
				</tr>
				<tr>
					<th>유형</th>
					<td>${dto.shirtType}</td>
				</tr>
				<tr>
					<th>재질(원단)</th>
					<td>${dto.shirtMaterial}</td>
				</tr>
				<tr>
					<th>재고</th>
					<td>${dto.shirtStock}개</td>
				</tr>
				
			</table>
		</c:when>
		<c:otherwise>
		<h1>존재하지 않는 정보입니다...</h1>
		</c:otherwise>
	</c:choose>
	
	<c:if test="${dto != null}">
		<a href="edit?shirtNo=${dto.shirtNo}">상품 수정</a>
		<a href="delete?shirtNo=${dto.shirtNo}">상품 삭제</a>
	</c:if>
	<a href="add2">상품 등록</a>
	<a href="list">상품 목록</a>
</body>
</html>