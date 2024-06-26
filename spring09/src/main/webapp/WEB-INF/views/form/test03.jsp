<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	<h1>신규 도서 등록</h1>
	<!-- 
	input은 여러 가지의 입력을 처리할 수 있다.
	- type이라는 속성을 통해 입력창의 형태를 바꿀 수 있다.
	- type의 기본값은 text이다.
	
	- (참고) 반드시 입력해야 하는 값은 required="required" 속성 추가
	- 만약 이름이랑 값이 같다면 특별히 이름만 써도 처리해 준다.
	- required, readonly, disabled, checked, selected, ...
	
	 -->
	<form action = "http://localhost:8080/save">
	도서명: <input type="text" name="bookTitle" required><br>
	저자: <input type="text" name="bookAuthor"required><br>
	출간일: <input type="date" name="bookPublicationDate"required><br>
	도서가격: <input type="text" name="bookPrice"required><br>
	출판사: <input type="text" name="bookPublisher"required><br>
	<!-- 1~1000사이에서 1씩 증가/감소하며 시작값은 1 -->
	페이지수: <input type="number" name="bookPageCount" required
					min="1" max="1000" step="1" value="1"><br>
	<!-- 장르: <input type="number" name="bookGenre"><br> -->
	
	<!--  
		select를 이용하여 선택 가능한 입력창을 만들 수 있다. 
		- option을 안에 넣어서 그 중에 고를 수 있도록 만든다.
	-->
	
	도서장르:
	<select name = "bookGenre" required>
		<option>자기게발</option>
		<option>수험서</option>
		<option>소설</option>
		<option>IT</option>
		<option>공포</option>
		<option>판타지</option>
	</select>
	<br><br>
	
	<button>등록하기</button>
	</form>
</body>
</html>