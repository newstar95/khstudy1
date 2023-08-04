<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>셔츠 등록 페이지</title>
</head>
<body>
	<form action = "add" method = "post">
		<h1>New 셔츠 등록!</h1>
		상품명 <input type = "text" name = "shirtName" required><br><br>
		색상<select name = "shirtColor" required>
			<option>블랙</option>
			<option>화이트</option>
			<option>그레이</option>
			<option>레드</option>
			<option>블루</option>
		</select><br><br>
		판매가 <input type = "number" name = "shirtPrice" required><br><br>
		종류 <select name = "shirtKind" required>
			<option>라운드</option>
			<option>브이넥</option>
			<option>정장</option>
		</select><br><br>
		유형 <select name = "shirtType" required>
			<option>민소매</option>
			<option>반팔</option>
			<option>긴팔</option>
		</select><br><br>
		재질 <input type = "text" name = "shirtMaterial"><br><br>
		판매수량 <input type = "number" name = "shirtStock" required><br><br>
		<button>셔츠 등록</button>
	</form>
	
	<h2><a href="list">상품목록으로 뒤로가기</a></h2>

</body>
</html>