//  java program that reads two integers, determines whether the first is a multiple of the second and print the result

package javaLab.Lab1;

import java.util.Scanner;

public class MultipleOfaNumberLab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1%n2==0)
			System.out.println(n1 + " is a multiple of "+n2);
		else
			System.out.println(n1 + " is NOT a multiple of "+n2);
	}
}
