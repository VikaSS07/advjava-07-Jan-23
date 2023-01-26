

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>User Sing in Page</title>");	
				out.print("<link rel='stylesheet' href='style.css' />");
			out.print("</head>");
			
			out.print("<body>");
			out.print("<div align='center'>");
				out.print("<h1>User Login Page</h1>");
				out.print("<form action='display' method='GET'>");
					out.print("User Name : <input name='uname'>");
					out.print("<br><br>");
					out.print("Password <input  type='password' name='upass'>");
					out.print("<br><br>");
					out.print("<button type='submit'>Login</button>");
				out.print("</form>");
			out.print("</div>");
			out.print("</body>");
		
		out.print("</html>");
	}

}
