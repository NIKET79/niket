package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SingleServlet
 */
@WebServlet("/input")
public class SingleServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String submit=request.getParameter("submit");
		switch(submit) {
		case "submit":doSubmit(request,response);
		break;
		case "edit": doEdit(request,response);
		break;
		case "update": doUpdate(request,response);
		break;
		}
		
	}
	protected void doSubmit(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("user_name");
		String mobile_number=request.getParameter("user_mobile");
		String hobby=request.getParameter("user_hobby");
		RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
		ServletContext context=request.getServletContext();
		context.setAttribute("name", name);
		context.setAttribute("number", mobile_number);
		context.setAttribute("hobby",hobby);
		
	}
	protected void doEdit(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Edit.jsp");
		rd.forward(request, response);
	}
	protected void doUpdate(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		out.println("<p style='color:green'>*Update successfully saved.</p>");
	}
}

