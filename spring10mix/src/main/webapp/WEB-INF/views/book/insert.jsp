<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	
	<form action = "insert" method="post">
		<h1>신규 도서 등록</h1>
		도서명 <input name = "bookTitle" required><br>
		저자 <input name = "bookAuthor" required><br>
		출간일 <input name = "bookPublicationDate" required><br>
		가격 <input name = "bookPrice" required><br>
		출판사 <input name = "bookPublisher" type = "date" required><br>
		쪽수 <input name = "bookPageCount" required><br>
		장르 <input name = "bookGenre" required><br>
		<button>도서 등록</button>
	</form>
	
	<h2><a href="list">도서목록으로 돌아가기</a></h2>
	
</body>
</html>