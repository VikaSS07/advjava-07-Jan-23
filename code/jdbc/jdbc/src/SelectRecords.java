import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectRecords {
	public static void main(String[] args) {
		try {
			Connection con = DbConnectionUtil.getConnection();
			PreparedStatement stmt = con.prepareStatement("select * from product");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getDouble("price") + "\t\t");
				System.out.print(rs.getInt("quantity") + "\n");
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}






