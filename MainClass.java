package busReservationSystem;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusRelated br=new BusRelated();
		try {
			System.out.println("Bus Details are given below : ");
			br.displayBusDetail();
			
			int choice=1;
			Scanner sc=new Scanner(System.in);
			while(choice==1) {
				System.out.println("Enter 1 to Book and 2 to exit");
				choice = sc.nextInt();
				if(choice == 1) {
					Booking booking = new Booking();
					if(booking.isavailable()) {
						BookingRelated bookingdao = new BookingRelated();
						bookingdao.addTickets(booking);
						System.out.println("Your booking is confirmed");
					}
					else
						System.out.println("Sorry. Bus is full. Try another bus or date.");
				}
			}
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
