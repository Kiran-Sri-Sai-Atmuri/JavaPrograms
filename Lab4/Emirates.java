package javaLab.Lab4;

public class Emirates extends BookingObject implements FlightOpeartions{
	public Emirates() {
		super("", "", "",  0 , 0);
	}

	

	@Override
	public void getAllAvailableFlights() {
		System.out.println("Emirates Airways fligth 2020 from vuyyuru to vijayawada");
		System.out.println("Emirates Airways fligth 2030 from vijayawada to vuyyuru");
	}

	@Override
	public void booking(BookingObject bookingObj) {
		
		bookingObj.display();
		
	}
}
