// java program to Print the Perfect numbers in the given range

package javaLab.Lab1;

import java.util.Scanner;

public class PerfectNumbersUptoN {
	
	private static boolean isPerfectNumber(int n) {
		
		int sum=0;
		for(int i=1 ; i<n ; i++)
			if(n%i==0)
				sum+=i;
			
		if(sum==n)
			return true;
		
		return false;
	}
	

	public static void main(String[] args) {
		
		System.out.print("Enter range : ");
		
		int range = new Scanner(System.in).nextInt();
		
		System.out.print("Perfect Numbers are : ");
		for(int i=1 ; i<range ;i++)
			if(isPerfectNumber(i))
				System.out.print(i + " ");

	}
}
