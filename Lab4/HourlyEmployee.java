package javaLab.Lab4;

public class HourlyEmployee extends Employee{

	double rate;
	double workingHours;
	
	@Override
	public double pay() {
		return (rate*workingHours) ;
	}
}
