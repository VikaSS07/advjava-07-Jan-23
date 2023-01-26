

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class Display extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		out.print("<div align='center'>");
		
		if("admin".equals(name) && "123".equals(pass)) {
			out.print("<h1 style='color:green'>Welcome User..</h1>");
		} else {
			out.print("<h1 style='color:red'>Invalid User name or password</h1>");
			out.print("<h3><a href='login'>Click here</a> to try again</h3>");
		}
			
		out.print("</div>");
	}

}










