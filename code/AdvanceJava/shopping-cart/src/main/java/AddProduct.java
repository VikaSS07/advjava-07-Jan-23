

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;

@WebServlet("/add-to-cart")
public class AddProduct extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("pid");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		Product product = new Product();
		product.setPid(Integer.parseInt(id));
		product.setPname(name);
		product.setPrice(Double.parseDouble(price));
		HttpSession session = request.getSession();
		ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartList");
		if(list == null) {
			list = new ArrayList<Product>();
			list.add(product);
		}
		else {
			list.add(product);
		}
		session.setAttribute("cartList", list);
		response.sendRedirect("product.jsp");
	}

}








