//  Example program on Scanner

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		
		String name = sc.nextLine();
		
		System.out.println("Hello "+name);
	}

}
