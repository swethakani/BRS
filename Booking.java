package busReservationSystem;

import java.sql.SQLException;
import java.text.*;
import java.util.*;

public class Booking {
	String passengerName;
	int busno;
	Date date;
	
	public Booking() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passenger Name:");
		passengerName=sc.next();
		System.out.println("Enter the busno: ");
		busno=sc.nextInt();
		System.out.println("Enter the date : dd-mm-yyyy");
		String dateIn=sc.next();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=sd.parse(dateIn);
			}
		catch(ParseException e) {
			System.out.println("expection"+e);
		}	
}
	
	public boolean isavailable() throws SQLException{
		BusRelated br=new BusRelated();
		BookingRelated bor=new BookingRelated();
		int capacity=br.getCapacity(busno);
		int bookedStatus=bor.getBookingCount(busno, date);
		
		return bookedStatus<capacity; //if only that is less than the capacity we can able to book the tickets
	}
	
}
