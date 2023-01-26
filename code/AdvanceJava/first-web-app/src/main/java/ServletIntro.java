import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-info")
public class ServletIntro extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("This is the first Servlet....");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		//OutputStream outStream = res.getOutputStream();
		out.print("<h1>Hello This is the response in HTML</h1>");
		
		
	}
}
