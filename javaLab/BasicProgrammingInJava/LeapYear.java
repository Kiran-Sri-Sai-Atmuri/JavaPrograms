//  java program to Check the given year is Leap year or not 

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.print("Enter Year : ");
		
		int x = new Scanner(System.in).nextInt();
		
		if(x%4==0) {
			if(x%100 == 0) {
				if(x%400 == 0)
					System.out.println(x + " is a Leap Year");
				else
					System.out.println(x + " is NOT a Leap Year");
			}
			else
				System.out.println(x + " is a Leap Year");
			
		}
		else
			System.out.println(x + " is NOT a Leap Year");
	}

}
