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
	Cookie[] list = request.getCookies();
	out.println("쿠기캐수: " + list.length + "개");
	
	for(int i = 0; i <list.length; i++){
		if(!list[i].getName().equals("JSESSIONID")){//index로 빼면 안됨 =>!는 not equals
%>
			쿠키 이름 : <%= list[i].getName() %>,
			쿠키 값 : <%= list[i].getValue() %> <br>
<%
		}
	}
%>

</body>
</html>