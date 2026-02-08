package javaLab.Lab8;

public class Mobile {

	String company_Name;
	String model_Name;
	float price;
	public Mobile(String company_Name, String model_Name, float price) {
		this.company_Name = company_Name;
		this.model_Name = model_Name;
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return company_Name + "," + model_Name + "," + price;
	}
	
	
	
	
	
}
