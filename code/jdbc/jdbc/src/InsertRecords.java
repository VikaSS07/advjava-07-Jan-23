import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
	public static void main(String[] args) {
		String query = "insert into product values(1,'Smart Watch', 2222.33, 5)";
		//String query = "update product set quantity=3 where id=1";
		//String query = "delete from product where id=1";
		
		try {
			Connection con = DbConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			int result = stmt.executeUpdate();
			con.close();
		
			System.out.println(result + " : Rows affected....");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
