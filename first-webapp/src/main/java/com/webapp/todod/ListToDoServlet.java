package com.webapp.todod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.login.LoginService;
import com.webapp.todod.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;



@WebServlet(urlPatterns = "/list-todos.do")
public class ListToDoServlet extends HttpServlet {

	private ToDoService todoservice = new ToDoService();
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	 			ServletException, IOException{ 	  
		 		request.setAttribute("todos", todoservice.retriveTodo());
		 	    request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	          }
}



