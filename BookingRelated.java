package busReservationSystem;
import java.util.*;
import java.sql.*;
public class BookingRelated {
	public int getBookingCount(int busno,java.util.Date date) throws SQLException {
		String query="select count(passenger_name) from booking where busno=? and dateon=?";
		Connection con=DBConnection.getConnection();
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, busno);
		st.setDate(2, sqlDate);
		ResultSet rs=st.executeQuery();
		rs.next();
		return rs.getInt(1);
 }
	public void addTickets(Booking book) throws SQLException {
		String query="Insert into booking values(?,?,?)";
		Connection con=DBConnection.getConnection();
		java.sql.Date sqlDate=new java.sql.Date(book.date.getTime());
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, book.passengerName);
		st.setInt(2, book.busno);
		st.setDate(3,sqlDate);
		
		st.executeUpdate();
	}
}
