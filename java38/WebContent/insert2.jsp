<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!--  
   1. 클라이언트가 입력해서 제출한 데이터를 받아와야 한다.
   2. DB연동해서 처리해서 결과 받아와야 한다.
   3. 받아온 결과에 따라서 화면을 html로 만들어서 클라이언트에게 전송한다.
   -->
<%
	// 1. VO를 만들어서
	MemberVO vo = new MemberVO();
	// 2. 전달되는 값 받은 다음, VO에 넣어야 한다.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	vo.setId(id);
	vo.setPw(pw);
	vo.setName(name);
	vo.setTel(tel);
	
	// 3. DAO이용해서, insert처리함.
	MemberDAO dao = new MemberDAO();
	boolean result = dao.create(vo);
	
	// 4. 처리결과를 client에게 알려주어야 함.
	String check = "회원가입 실패!!";
	if(result){
		check = "회원가입 성공!!";
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>회원가입 결과는 <%= check %></h3>
	
	<a href="member.html">로그인 페이지로</a>
</body>
</html>