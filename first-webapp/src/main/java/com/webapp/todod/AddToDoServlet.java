package com.webapp.todod;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddToDoServlet extends HttpServlet {

	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException{ 	  
	    request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
   }
	
	
	private ToDoService todoservice = new ToDoService();
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException{ 	  
		 
		 //String newToDo = request.getParameter("todo"); 
		 todoservice.addTodo(new ToDo (request.getParameter("todo")));
		 response.sendRedirect("/list-todos.do");
	    
   }
}