package javaLab.Lab4;

public class SalariedEmployee extends Employee{

	double commisionRate;
	double grossSales;
	double basic;
	
	@Override
	public double pay() {
		return basic + ((grossSales*commisionRate)/100);
	}
	
}
