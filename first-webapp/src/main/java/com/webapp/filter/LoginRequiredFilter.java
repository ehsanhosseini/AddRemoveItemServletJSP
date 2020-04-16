package com.webapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = {"*.do"}) // Filter everthing which end with .do in all servlets url
public class LoginRequiredFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)servletRequest; // to handle HttpServletRequest
		
		System.out.println(request.getRequestURI());
		if(request.getSession().getAttribute("Name")!=null) { //use is login and allow the user to continue
			chain.doFilter(servletRequest, servletResponse);
		}else { // send it to login page
			request.getRequestDispatcher("/login.do").forward(servletRequest, servletResponse);
		}
		
		
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
