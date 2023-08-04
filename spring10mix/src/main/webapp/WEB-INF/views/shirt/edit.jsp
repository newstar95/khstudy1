<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정</title>
</head>
<body>
	<h1>상품 수정</h1>
	<form action = "edit" method="post">
		<input type = "hidden" name = "shirtNo" value = "${dto.shirtNo}">
		
		상품명 <input name = "shirtName" value="${dto.shirtName}" required><br><br>
		색상<select name = "shirtColor" value="${dto.shirtColor}" required>
			<option>블랙</option>
			<option>화이트</option>
			<option>그레이</option>
			<option>레드</option>
			<option>블루</option>
		</select><br><br>
		판매가 <input name = "shirtPrice" value="${dto.shirtPrice}" required><br><br>
		종류 <select name = "shirtKind" value="${dto.shirtKind}" required>
			<option>라운드</option>
			<option>브이넥</option>
			<option>정장</option>
		</select><br><br>
		유형 <select name = "shirtType" value="${dto.shirtType}" required>
			<option>민소매</option>
			<option>반팔</option>
			<option>긴팔</option>
		</select><br><br>
		재질 <input name = "shirtMaterial" value="${dto.shirtMaterial}"><br><br>
		판매수량 <input type = "number" name = "shirtStock" value="${dto.shirtStock}" required><br><br>
		<button>상품 수정</button>
	</form>
	
	<h3><a href="detail?shirtNo=${dto.shirtNo}">뒤로가기</a></h3>
</body>
</html>