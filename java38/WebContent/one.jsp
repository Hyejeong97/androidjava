<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- 
	1. id�� �޾ƿ;� ��.
	2. dao�� �����Ͽ� ��� �޾ƿ;� ��.
	3. html�� ���� �����ؾ� ��.
	 -->
	 
<%
	String id = request.getParameter("id");
	MemberDAO dao = new MemberDAO();
	MemberVO vo = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= vo.getId() %>ȸ������ �˻� �����Դϴ�.</h3>
<hr>

<table>
	<tr align="center">
		<td width="100" bgcolor="yellow">���̵�</td>
		<td width="200" bgcolor="pink"><%= vo.getId() %></td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">��й�ȣ</td>
		<td width="200" bgcolor="pink"><%= vo.getPw() %></td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">�̸�</td>
		<td width="200" bgcolor="pink"><%= vo.getName() %></td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">��ȭ��ȣ</td>
		<td width="200" bgcolor="pink"><%= vo.getTel() %></td>
	</tr>

</table>
<hr color="green">

[ <a href="index.html">
<button style=background:green>ó����������</button></a> |


<a href="udate.jsp?id=<%=vo.getId()%>">
<button style=background:gold>����</button></a> |


<a href="delete.jsp?id= <%= vo.getId() %>">
<button style=background:lime>����</button></a> ]




</body>
</html>