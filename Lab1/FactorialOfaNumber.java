//  java program to find the Factorial of a number 

package javaLab.Lab1;

import java.util.Scanner;

public class FactorialOfaNumber {
	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		
		double a = new Scanner(System.in).nextDouble();
		double r =1;
		for(double i=1;i<=a;i++) {
			r*=i;
		}
		
		System.out.println("Factorial of '"+a+"' is : "+r);
	}
	
}
