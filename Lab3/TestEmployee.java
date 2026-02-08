//	Write a program to maintain the office database using single inheritance. 
//	Superclass is Employee that contain the information as follows- Emp_code, 
//	Emp_name, Address, Ph_no, Da 10%, Hra-20%. Employee class can have 
//	computeSalary() method to finding the total salary. Create two subclasses of 
//	Manager, Typist each class having their own basic pay & da,hra. You have to 
//	override computeSalary() method in subclasses 


package javaLab.Lab3;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 for Manager 2 for Typist : ");
		int n = sc.nextInt();
		if(n==1) 
			new Manager().computeSalary();
		
		else if(n==2) 
			new Typist().computeSalary();
		sc.close();
	}

}
