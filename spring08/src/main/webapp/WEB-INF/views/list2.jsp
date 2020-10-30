<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품전체정보</h3>
<hr>
<c:forEach var="vo" items="${list}">
	상품 no: ${vo.no}/
	상품 name: ${vo.name}/
	상품 content: ${vo.content}/
	상품 price: ${vo.price}<br>
</c:forEach>
</body>
</html>