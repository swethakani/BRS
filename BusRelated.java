package busReservationSystem;

import java.sql.*;
import java.sql.SQLException;

public class BusRelated {

	public void displayBusDetail() throws SQLException {
		Connection con=DBConnection.getConnection();
		String query="select * from bus";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus no is : "+rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.println("No AC Bus");
			}
			else {
				System.out.println("AC Bus");
			}
			System.out.println("Capacity is : "+rs.getInt(3));
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------");
		
	}
	
	public int getCapacity(int id) throws SQLException {
		Connection con=DBConnection.getConnection();
		String query="select capacity from bus where id="+id;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
}
