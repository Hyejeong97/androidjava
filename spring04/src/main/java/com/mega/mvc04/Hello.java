package com.mega.mvc04;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id = null;
	String pw = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		response.setContentType("text.html");
		response.getWriter().println("<h1>id " + id + "</h1><br>");
		response.getWriter().println("<h1>pw " + pw + "</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}