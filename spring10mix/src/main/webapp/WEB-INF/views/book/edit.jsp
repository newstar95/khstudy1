<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 수정</title>
</head>
<body>
	<h1>도서 수정</h1>
	<form action = "edit" method="post">
		<input type = "hidden" name = "bookId" value = "${dto.bookId}">
		
		도서명 <input name = "bookTitle" value="${dto.bookTitle}" required><br>
		저자 <input name = "bookAuthor" value="${dto.bookAuthor}" required><br>
		출간일 <input name = "bookPublicationDate" value="${dto.bookPublicationDate}" type="date" required><br>
		가격 <input name = "bookPrice" value="${dto.bookPrice}" required><br>
		출판사 <input name = "bookPublisher" value="${dto.bookPublisher}" required><br>
		쪽수 <input name = "bookPageCount" value="${dto.bookPageCount}" required><br>
		장르 <input name = "bookGenre" value="${dto.bookGenre}" required><br>
		<button>도서 등록</button>
	</form>
	
	<h2><a href="list">도서목록으로 돌아가기</a></h2>
	
</body>
</html>