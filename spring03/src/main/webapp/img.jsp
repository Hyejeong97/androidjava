<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${param.color}색 자동차!!<!-- 파라미터 넘겨서 출력용 -->
	<img src="resources/img/123.jpg">
	<a href="car.do?color=red">피곤해,,</a>
</body>
</html>