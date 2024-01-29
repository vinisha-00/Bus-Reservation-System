package bus_reservation_project;
import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;
import java.util.Date;

import bus_reservation_project.Booking;


public class BusDemo {
	 
	public static void main(String[] args) {
		
		
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
		buses.add(new Bus(1 ,true,2,"vinishaexpress"));
		buses.add(new Bus(2 , false , 50,"fasttrackexpress"));
		buses.add(new Bus(3,true,48,"redbusexpress"));
		buses.add(new Bus(4,true,10,"dragonexpress"));
		buses.add(new Bus(5,true,20,"point to point"));
		buses.add(new Bus(6,false,222,"sujaspeeds"));
		buses.add(new Bus(7,true,289,"tigerspeedy"));
		buses.add(new Bus(8,false,56,"gunabuses"));
		
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		Booking book=new Booking();
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
					
					
					System.out.println("Your booking  details:" +  book.passengerName +   book.busNo +  book.date );
					
					
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}


}
