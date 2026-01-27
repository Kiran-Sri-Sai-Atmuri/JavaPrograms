//  java program to print the same digit numbers in the given range

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class SameDigitNumberInRange {
	
	private static boolean isSameDigit(int i) {
		
		int j =i;
		int l = i;
		int digit =0 ;
		while(j!=0) {
			digit++;
			j/=10;
		}
		
		int c=i%10;
		boolean b=false;
		
		for(int k=1;k<=digit;k++) {
			while(l!=0) {
				int r=l%10;
				if(r==c)
					b=true;
				else
					b=false;
				l/=10;
			}
		}
		
		return b;
	}

	public static void main(String[] args) {
		
		System.out.print("Enter a range : ");
		
		int range = new Scanner(System.in).nextInt();
		
		System.out.print("Same digit Numbers are : ");
		for(int i=1;i<=range;i++) {
			if(isSameDigit(i)) 
				System.out.print(i + " ");
		}
	}

}
