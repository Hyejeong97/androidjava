<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
나는 수정 페이지<br>
검색결과: ${bbsVO2} <!-- 세션 이름 -->
<hr>

제목 : ${bbsVO2.title}<br>
내용 : ${bbsVO2.content}<br>
작성자 : ${bbsVO2.writer}<br>

<a href="delete.do">삭제</a>
</body>
</html>