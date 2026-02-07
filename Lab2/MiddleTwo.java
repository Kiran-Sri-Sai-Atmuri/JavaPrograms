//	Given a string of even length, return a string made of the middle two chars, 
//	so the string "string" yields "ri". The string length will be at least 2.

package javaLab.Lab2;

import java.util.Scanner;

public class MiddleTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sting with Even Length : ");
		
		String s = sc.nextLine();
		
		int len = s.length();
		if(len%2!=0)
			System.out.println("Enter correct string with even length");
		else {
			String s1 = "" + s.charAt(len/2-1) + s.charAt(len/2);
			
			System.out.println(s1);
		}
		
		sc.close();
		
		

	}

}
