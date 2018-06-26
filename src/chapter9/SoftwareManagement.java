package chapter9;
import java.sql.*;

public class SoftwareManagement {

	public static void main(String[] args) {
		try {
			//1. load driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//2.get connection
			Connection con = DriverManager.getConnection("jdbc:sqlserver://pc01;database=ManNhi", "sa", "1");
			
			//3. statement
			String sql = "Select * from software";
			Statement st = con.createStatement();
			
			//run
			ResultSet rs = st.executeQuery(sql);
			
			
			System.out.println("====Soft Ware Book====");
			
			while(rs.next()) {
				String title = rs.getString("title");
				float price = rs.getFloat("price");
				System.out.println("Title: "+title);
				System.out.println("Price: "+price);
				System.out.println("==== ====");
			}
			//close connection
			con.close();
		}
		catch(Exception ex) {}

	}

}
