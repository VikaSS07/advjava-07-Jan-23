import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnectionUtil {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/advjava07jan","root","root");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
