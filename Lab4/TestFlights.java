package javaLab.Lab4;

public class TestFlights {

	public static void main(String[] args) {
		FlightOpeartions ba = new BritishAirways();
		FlightOpeartions aa = new AirasiaFlight();
		FlightOpeartions ea = new Emirates();
		
		ba.getAllAvailableFlights();
		aa.getAllAvailableFlights();
		ea.getAllAvailableFlights();
		
		BookingObject obj = new BookingObject("kiran", "vijayawada","vuyyuru",45, 18);
		
		ea.booking(obj);
		}
}
