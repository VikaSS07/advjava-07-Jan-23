package edu.todo.filter;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {"/create-my-task"})
public class TaskValidationFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// cast the ServletRequest and Response into HttpServleteRequest and Response
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		// get the parameter from the request 
		String title = req.getParameter("title");
		String scheduledOn = req.getParameter("scheduledOn");
		// this list to add error message.
		ArrayList<String> errors = new ArrayList<String>();
		// validate the data
		if(title == null || title.isEmpty()) {
			errors.add("Please provide the Title");
		}
		if(scheduledOn == null || scheduledOn.isEmpty()) {
			errors.add("Please provide the Scheduled Date");
		}
		if(errors.isEmpty()) { // if no error found in the list
			chain.doFilter(request, response); // move to actual execution
		} else { // is error found in the list
			req.setAttribute("errorList", errors);
			RequestDispatcher dis = req.getRequestDispatcher("create-task.jsp");
			dis.forward(req, resp);
		}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
