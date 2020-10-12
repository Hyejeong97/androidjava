<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie c1 = new Cookie("subject", "스프링");
	Cookie c2 = new Cookie("place", "709호");
	Cookie c3 = new Cookie("personnel", "100명");
//	c1.setMaxAge(0);//얼마나 살아있을지 값을 주는 것, 0대입시 죽음
	
	response.addCookie(c1);
	response.addCookie(c2);
	response.addCookie(c3);
	
	c1.setMaxAge(0);
	c2.setMaxAge(0);
	c3.setMaxAge(0);
%>

<h3>브러우저에 쿠키를 심었음.</h3>
<a href="쿠키가져오기연습.jsp">브라우저에서 쿠키가져오기</a>

</body>
</html>