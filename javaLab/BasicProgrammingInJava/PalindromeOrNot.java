//  java program to Check the given number is palindrome or not

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		int x = new Scanner(System.in).nextInt();
		int y=x;
		int z=x;
		int c=0;
		
		while(y!=0) {
			c++;
			y/=10;
		}
		
		int n=0;
		
		for(int i=0;i<c;i++) {
			int a = z%10;
			n=(n*10)+(a);
			z/=10;
		}
	
		if(x==n) 
			System.out.println(x + " is Palindrome");
		else 
			System.out.println(x + " is NOT palindrome");
	
	}
}
