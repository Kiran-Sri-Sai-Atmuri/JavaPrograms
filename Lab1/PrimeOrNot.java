// Java Program to check the given number is prime or not

package javaLab.Lab1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		
		int n =new Scanner(System.in).nextInt();
		
		int flag=0;
		
		for(int i=2;i<n;i++) 
				if(n%i==0)
					flag=1;
		
		if(flag==1) 
			System.out.println(n + " Is a Prime Number");
		else 
			System.out.println(n + " Is NOT a Prime Number");
		

	}

}
