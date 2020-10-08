<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 	session.setAttribute("id", "park");//이름, 벨류
	session.setAttribute("name", "박길동");//이름, 벨류
	application.setAttribute("count", 100); 
%>
<a href="세션보기.jsp">세션보기</a>
<a href="세션보기2.jsp">세션보기3</a>

</body>
</html>