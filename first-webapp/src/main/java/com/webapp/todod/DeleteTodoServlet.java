package com.webapp.todod;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet{

	
	private ToDoService todoservice = new ToDoService();
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	 			ServletException, IOException{ 	
		 		todoservice.deleteTodo(new ToDo(request.getParameter("todo"), request.getParameter("category"))); // todo is comming from method from ToDoService
		 		response.sendRedirect("/list-todos.do");
		 		
	          }
}
