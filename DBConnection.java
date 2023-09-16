package busReservationSystem;

import java.sql.*;

public class DBConnection {
	
	private static final String url="jdbc:mysql://localhost:3306/busrev";
	private static final String userName="root";
	private static final String password="KKSswetha@2003";
	
	public static Connection getConnection() throws SQLException {
		Connection con=DriverManager.getConnection(url,userName,password);
		return con;
	}
}