<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    String id = request.getParameter("id");
    MemberDAO dao = new MemberDAO();
    int result = dao.read(id);
    
    String idcheck = "<font color=red>사용 불가능한 id입니다</font>";
    if(result == 0){
    	idcheck = "<font color=green>사용 가능한 id입니다</font>";
    }
    %><%= idcheck %>