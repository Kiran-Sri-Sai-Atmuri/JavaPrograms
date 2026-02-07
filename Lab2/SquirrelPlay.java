//	The squirrels in Palo Alto spend most of the day playing. In particular, they play 
//	if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the 
//	upper limit is 100 instead of 90. Given an int temperature and a boolean 
//	isSummer, return true if the 
//	squirrels play and false otherwise. 

package javaLab.Lab2;

import java.util.Scanner;

public class SquirrelPlay {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter temperatur : ");
		double temperature = sc.nextDouble();
		System.out.print("isSummer(enter 'true' or 'false') : ");
		boolean isSummer = sc.nextBoolean();
		boolean result = false;
		if(isSummer)
			result = summer(temperature);
		else
			result = normal(temperature);
			
		
		System.out.println("Do squirrels play : "+result);
		
		sc.close();
		
	}

	private static boolean normal(double temperature) {
		if(temperature >=60 && temperature <=90)
			return true;
		return false;
	}

	private static boolean summer(double temperature) {
		if(temperature >=60 && temperature <=100)
			return true;
		return false;
	}

	
	

}
