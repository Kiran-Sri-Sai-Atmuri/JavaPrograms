package javaLab.Lab4;

public class AirasiaFlight extends BookingObject implements FlightOpeartions {

	
	
	public AirasiaFlight() {
		super("", "", "",  0 , 0);
		
	}

	

	@Override
	public void getAllAvailableFlights() {
		System.out.println("AirasiaFlight Airways fligth 2020 from vuyyuru to vijayawada");
		System.out.println("AirasiaFlight Airways fligth 2030 from vijayawada to vuyyuru");
		
		
	}

	@Override
	public void booking(BookingObject bookingObj) {
		
		System.out.println("Your details are : ");
		bookingObj.display();
		
	}
	
	
	
}
