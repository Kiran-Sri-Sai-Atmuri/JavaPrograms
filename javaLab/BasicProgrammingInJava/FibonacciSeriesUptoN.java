//  java program to print the Fibonacci series up to the given range n

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class FibonacciSeriesUptoN {

	public static void main(String[] args) {
		
		System.out.print("Enter range : ");
		
		int range = new Scanner(System.in).nextInt();
		int a= 0;
		int b=1;
		int c=0;
		
		System.out.print(a+" "+b + " ");
		
		while(true) {
			
			c= a+b;
			if(c>range)
				break;
			System.out.print(c + " ");
			a=b;
			b=c;
			
		}
	}
}
