<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
<form action="create2.do">
id : <input type="text" name="id"><br>
pw : <input type="password" name="pw"><br>
name : <input type="text" name="name"><br>
tel : <input type="text" name="tel"><br>
<button type="submit">제출</button>
</form>
<hr color="red">

<h1>회원검색</h1>
<form action="one2.do">
id : <input type="text" name="id"><br>
<button type="submit">검색</button>
</form>
<hr color="red">

<h1>회원전체검색</h1>
<form action="list2.do">
<button type="submit">전체검색</button>
</form>
<hr color="red">

<h1>탈퇴</h1>
<form action="delete2.do">
id : <input type="text" name="id"><br>
<button type="submit">회원탈퇴</button>
</form>
<hr color="red">

<h1>정보수정</h1>
<form action="update2.do">
id : <input type="text" name="id"><br>
tel : <input type="text" name="tel"><br>
<button type="submit">정보수정</button>
</form>

</body>
</html>