 // java program to print the prime factors of a given number.

package javaLab.Lab1;

import java.util.Scanner;

public class PrimeFactorsOfaNumber {
	
	public static boolean isPrime(int n) {
		
		int flag=1;
		
		for(int i=2;i<n;i++)
			if(n%i==0) 
				flag=0;
			
		if(flag==1) 
			return true;
		
		return false;
	}

	public static void main(String[] args) {

		System.out.print("Enter a number : ");
		
		int n = new Scanner(System.in).nextInt();
		
		System.out.print("Prime Factors of '"+n + "' are : ");
		for(int i=2;i<=n;i++) 
			if(n%i==0) 
				if(isPrime(i))
					System.out.print(i + " ");
			
	}
}
