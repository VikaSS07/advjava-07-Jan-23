

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class Home extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String message = (String) request.getAttribute("user-msg");
		
		out.print("<div align='right'>");
			out.print("<h3>User, "+name+" </h3>");
		out.print("</div>");
		out.print("<hr>");
		out.print("<div align='center'>");
			out.print("<h1>"+message+" </h1>");
		out.print("</div>");
	}

}
