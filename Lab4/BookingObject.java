package javaLab.Lab4;

public class BookingObject {

	String name ;
	String source;
	String destination;
	int seat;
	int age;
	
	public BookingObject(String name, String source, String destination, int seat, int age) {
		
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.seat = seat;
		this.age = age;
	}
	
	public void display() {
		System.out.println("name : "+name +" source : "+source + " destination : "+destination +" seat : "+seat +" age : "+age);
	}
	
}
