// 	Given a String name, e.g. "Bob", return a greeting of the form "Hello Bob!" 

package javaLab.Lab2;

import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Hello "+name+"!");
		
		sc.close();

	}

}
