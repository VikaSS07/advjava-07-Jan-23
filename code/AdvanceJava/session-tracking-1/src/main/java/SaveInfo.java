

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-info")
public class SaveInfo extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email= request.getParameter("email");
		String contact= request.getParameter("contact");
		String city = request.getParameter("city");
		String pin= request.getParameter("pin");
		String state= request.getParameter("state");
		String title = request.getParameter("title");
		String percent = request.getParameter("percent");
		String year = request.getParameter("year");
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
		System.out.println("Year : " + year);
		// DB Connection
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/advjava7jan","root","root");
			PreparedStatement stmt = con
					.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, contact);
			stmt.setString(4, city);
			stmt.setString(5, pin);
			stmt.setString(6, state);
			stmt.setString(7, title);
			stmt.setString(8, percent);
			stmt.setString(8, year);
			count = stmt.executeUpdate();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		int code = count>0? 1 : 0;
		response.sendRedirect("personal-into.jsp?c="+code);
	}

}










