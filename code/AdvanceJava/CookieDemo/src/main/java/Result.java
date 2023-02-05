

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Result extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("q");
		String value = data.replaceAll(" ", "_");
		
		// To Create a Cookie
		Cookie ck1 = new Cookie("search", value);
		Cookie ck2 = new Cookie("lastvisit", LocalDateTime.now().toString());
		// To Set the alive time of the cookie in Seconds 
		ck1.setMaxAge(365*24*60*60);
		ck2.setMaxAge(365*24*60*60);
		// To Send Cookie at Client Side
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Hello user, </h1>");
		out.print("<h1>YOu Search For : "+data+"</h1>");
	}
}










