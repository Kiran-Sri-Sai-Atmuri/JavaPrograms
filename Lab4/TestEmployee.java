package javaLab.Lab4;

public class TestEmployee {
	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee();
		se.empCode = 121;
		se.firstName = "kiran";
		se.lastName = "sri sai";
		se.commisionRate=10;
		se.grossSales = 1000;
		se.basic=15000;
		
		System.out.println(se.pay());
		
		
		HourlyEmployee he = new HourlyEmployee();
		he.empCode = 12;
		he.firstName = "naikar";
		he.lastName = "swamy";
		he.rate=100;
		he.workingHours=12;
		
		System.out.println(he.pay());
	}

}
