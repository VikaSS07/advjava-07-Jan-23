import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbConenction {
	public static void main(String[] args) {
		try {
			// Oracle : oracle.jdbc.driver.OracleDriver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Oracle Url : jdbc:oracle:thin:@localhost:1521:xe
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava07jan", "root", "root");
		
			PreparedStatement stmt = 
					con.prepareStatement("create table product(id int, name varchar(40), price double, quantity int)");
			int count = stmt.executeUpdate();
			
			con.close();
			
			System.out.println("Connection Success...");
			System.out.println(count + " : table created");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
