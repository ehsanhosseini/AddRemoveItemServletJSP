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

	// to handle Get request
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	 			ServletException, IOException{ 	  
		 
		 	// Where jsp is /WEB-INF/views/login.jsp
			//when we write login.do we need to redirect servlet to Jsp. here we get request and redirecte it to jsp. 
			//When we load the first page which is http://localhost:8080/login.do , it is get method. so we get the request from browser and redircet it to login.jsp to display the long page
		 	    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	          }
	 
	 private LoginService uservalidationservice = new LoginService();
	//When we have password and user name so we dont want everone see the password so we use post method. first we need to creat a form in jsp with method Post  
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException{
		 
		 String name = request.getParameter("name");  //// Parameter pass from browser as request. ex: http://localhost:8080/login.do?name=ehsan
		 String password = request.getParameter("password");
		 
		 boolean isuservalid = uservalidationservice.isUserValid(name, password);
		 if(isuservalid) {
			 request.getSession().setAttribute("Name", name);  // setAttribute("name of atribute", value of name)/(String name, Object obj)
			 													//// setting an atribut into request. servlet take the parameter and put it as atribute into request so Jsp can see it.
			 													
			 response.sendRedirect("/list-todos.do");  
		 }
		 else {
			// request.setAttribute("errorMessage", "Sorry Worng Craditioal, Try Again!!!");
			 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		 }
	 }
}

