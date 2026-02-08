//  java program to print the prime numbers up to the given range n 

package javaLab.Lab1;

import java.util.Scanner;

public class PrimeNumbersUptoN {

	public static void main(String[] args) {
		
		System.out.print("Enter range : ");
		
		int range = new Scanner(System.in).nextInt();
		
		int c=2;
		while(c<=range) {
			
			int flag =1;
			
			for(int i=2;i<c;i++) {
				if(c%i==0)
					flag=0;
			}
			
			if(flag == 1) 
				System.out.print(c + " ");
			
			c++;
		}

	}

}
