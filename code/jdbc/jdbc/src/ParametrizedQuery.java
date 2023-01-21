import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ParametrizedQuery {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int i = scan.nextInt();
		System.out.println("Enter Name : ");
		String name = scan.next();
		System.out.println("Enter Price : ");
		double price = scan.nextDouble();
		System.out.println("Enter Quantity : ");
		int qty = scan.nextInt();
		
		// Parameterized Query
		String query = "insert into product values(?,?,?,?)";
		//String query = "UPDATE product SET quantity=? where id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava07jan","root","root");
			PreparedStatement stmt = con.prepareStatement(query);
			
			// to set the values you can use the setter methods of the PreapredStatement object.
			// stmtObject.setXXX(parameter-number, value);
			stmt.setInt(1, i);
			stmt.setString(2, name);
			stmt.setDouble(3, price);
			stmt.setInt(4, qty);
			
			int result = stmt.executeUpdate();
			con.close();
		
			System.out.println(result + " : Rows affected....");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
