<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>링크 배우기</title>
</head>
<body>
	<h1>링크 배우기</h1>
	
	<!-- 
	링크<앵커>태그
	- 현재 페이지가 아닌 다른 페이지로 연결하는 태그
	- 태그만으로는 정보가 부족하므로 속성(attribute)을 작성해야 함
	    - 주의! 속성간에는 반드시 띄어쓰기(whitespace)가 필요하다.
	    - 주의! 속성의 값은 따옴표로 감싸야 한다.(종류는 무관)
	- 내부 링크(내것)와 외부 링크(남의 것)로 구분 한다.
	- 내 주소는 생략이 가능
	 -->
	 
	 <!-- 절대경로(absolute pah) 
	 - 언제 어디서나 동일한 경로
	 - 생략하여 적을 경우 /로 시작해야 함
	 내가 어디 있느냐에 따라 위치가 달라지기 때문에 굉장히 가까운 것을 부를 때 사용한다.
	 -->
	 <a href="http://localhost:8080/heading">헤드라인 예제 보기</a> <br><br>
	 <a href="//localhost:8080/heading">헤드라인 예제 보기</a> <br><br>
	 <a href="/heading">헤드라인 예제 보기</a> <br><br>
	 <!-- 
	 상대경로(relative path)
	 - 현재 위치를 기준으로 계산한 경로
	 - 아무 말도 없이 적으면 현재 endpoint를 기준으로 탐색
	  -->
	 <a href="./heading">헤드라인 예제 보기</a> <br><br>
	 
	 <a href="https://www.google.com/">구글로 이동</a> <br><br>
	 <a title="구글로 이동" href="https://www.naver.com/">네이버로 이동</a> <br><br>
	 
	 
</body>
</html>