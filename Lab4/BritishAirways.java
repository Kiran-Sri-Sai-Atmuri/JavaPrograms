package javaLab.Lab4;

public class BritishAirways extends BookingObject implements FlightOpeartions{

	public BritishAirways() {
		super("", "", "",  0 , 0);
	}


	@Override
	public void getAllAvailableFlights() {
		System.out.println("British Airways fligth 2020 from vuyyuru to vijayawada");
		System.out.println("British Airways fligth 2030 from vijayawada to vuyyuru");
	}

	@Override
	public void booking(BookingObject bookingObj) {
		
		bookingObj.display();
		
	}

}
