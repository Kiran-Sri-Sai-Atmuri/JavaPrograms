// java program to Check the given number is Perfect or not

package javaLab.Lab1;

import java.util.Scanner;

public class PerfectNumberOrNot {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		
		int sum=0;
		
		for(int i=1;i<n;i++)
			if(n%i==0)
				sum+=i;
		
		if(sum==n)
			System.out.println(n + " is a Perfect Number");
		else
			System.out.println(n + " is NOT a Perfect Number");
			
	}
}
