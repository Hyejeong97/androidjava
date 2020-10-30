<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 등록 정보입니다.</h3>
<hr color="red">
제목 : ${bbsVO.title}<br>
내용 : ${bbsVO.content}<br>
작성자 : ${bbsVO.writer}<br>
<a href="bbs.jsp">첫 페이지</a>
<a href="update.do">수정 페이지</a>
</body>
</html>