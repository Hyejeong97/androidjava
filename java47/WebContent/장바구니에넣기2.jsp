<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>장바구니에 넣기</h3>
<hr color="red">
<form action="add.jsp">
<select name="product">
	<option value="watch">시계</option>
	<option value="ballPen">볼펜</option>
	<option value="noteBook">노트북</option>
</select>

<select name="price">
	<option value="10000">10000원</option>
	<option value="20000">20000원</option>
	<option value="30000">30000원</option>
</select><br>
<button type="submit">장바구니에 넣기</button>
<a href="add2.jsp">목록보기</a>
</form>

</body>
</html>