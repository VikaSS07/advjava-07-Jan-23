
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth")
public class Auth extends HttpServlet {

	HashMap<String, String> users = new HashMap<String, String>();

	public Auth() {
		users.put("Admin", "admin123");
		users.put("Abc", "abc123");
		users.put("Xyz", "xyz123");
		users.put("Lmn", "lmn123");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		if (users.containsKey(name)) {
			String value = users.get(name);
			if (value.equals(pass)) {
				HttpSession session = request.getSession(); // to create a session
				session.setAttribute("un", name); // to set value inside session
				response.sendRedirect("home.jsp");
			} else {
				response.sendRedirect("Login.jsp?c=-1");
			}
		} else {
			response.sendRedirect("Login.jsp?c=-1");
		}
	}
}





