//  java program to print the Perfect squares in the given range

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class PerfectSquaresInRange {
	
	
	public static boolean isPerfectSquare(int n) {
		for(int i=1;i<=n/2;i++)
			if(i*i==n)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a range : ");
		int range = new Scanner(System.in).nextInt();
		
		System.out.print("Perfect Squares are : ");
		for(int i=1;i<=range;i++) 
			if(isPerfectSquare(i)) 
				System.out.print(i + " ");
		
	}
}
