<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
   <%
   String id = request.getParameter("id");
   MemberDAO dao = new MemberDAO(); //1~2�ܰ�
   boolean result = dao.delete(id);
   String check = "Ż�� ó�� �� ������ �߻���. Ż��ó�� ���� ����.";
   if(result){
	   check="Ż��ó�� �Ϸ�!";
   }
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>Ż�� ����� �Ʒ��� �����ϴ�.</h3>
<hr>
<span style="color:red">
<%= check %>
</span>
</body>
</html>