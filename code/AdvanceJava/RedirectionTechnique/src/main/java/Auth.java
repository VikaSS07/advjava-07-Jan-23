

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth")
public class Auth extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		String msg = "Hello "+name+", Welcome To Home Page ";
		
		if("Abc@gmail.com".equals(name) && "abc123".equals(pass)) {
			// go to Home Page
			request.setAttribute("user-msg", msg);
			RequestDispatcher dis = request.getRequestDispatcher("home");
			dis.forward(request, response);
		} else {
			// go to error page
			response.sendRedirect("error");
		}
		
	}

}
















