package com.mega.mvc04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class Hi extends HttpServlet {
	String id = null;
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config){
		id = config.getInitParameter("id");
		System.out.println(id);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 부모클래스에 service()
		// 요청방식에 따라서, doGet(), goPost()
		// jsp의 모든 코드는 서블릿의 service() 메서드 안으로 구현!
		// jsp의 모든 변수는 service() 지역변수
		
		System.out.println("get요청됨.");
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + name + ": get</h1>");
		out.println("<h1>login id " + id);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청됨.");
		doGet(request, response);
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + name + ": get</h1>");
		out.close();
	}

}