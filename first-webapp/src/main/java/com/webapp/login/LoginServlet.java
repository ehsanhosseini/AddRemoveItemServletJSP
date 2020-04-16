package com.webapp.login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.webapp.todod.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;



@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	 			ServletException, IOException{ 	  
		 	    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	          }
	 
	 private LoginService uservalidationservice = new LoginService();
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException{
		 
		 String name = request.getParameter("name");
		 String password = request.getParameter("password");
		 
		 boolean isuservalid = uservalidationservice.isUserValid(name, password);
		 if(isuservalid) {
			 request.getSession().setAttribute("Name", name);
			 response.sendRedirect("/list-todos.do");
		 }
		 else {
			 request.setAttribute("errorMessage", "Sorry Worng Craditioal, Try Again!!!");
			 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		 }
	 }
}

