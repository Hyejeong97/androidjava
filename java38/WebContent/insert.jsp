<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	MemberDAO dao = new MemberDAO();
	dao.create(id, pw, name, tel);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>입력 정보</h2>
아이디 : <%= id %><br>
비밀번호 : <%= pw %><br>
이름 : <%= name %><br>
핸드폰 : <%= tel %><br>
<a href="member.html">회원가입 페이지로</a>
</body>
</html>