<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상품등록</h1>
<form action="create2.do">
no : <input type="text" name="no"><br>
name : <input type="text" name="name"><br>
content : <input type="text" name="content"><br>
price : <input type="text" name="price"><br>
<button type="submit">등록</button>
</form>
<hr color="red">

<h1>상품전체검색</h1>
<form action="list2.do">
<button type="submit">전체검색</button>
</form>
<hr color="red">

<h1>상품삭제</h1>
<form action="delete2.do">
id : <input type="text" name="no"><br>
<button type="submit">상품삭제</button>
</form>
<hr color="red">

<h1>상품정보수정</h1>
<form action="update2.do">
상품 no : <input type="text" name="no"><br>
상품 name : <input type="text" name="name"><br>
상품 content : <input type="text" name="content"><br>
상품 price : <input type="text" name="price"><br>
<button type="submit">수정</button>
</form>

</body>
</html>