// java program to Check the given number is Armstrong or not

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class ArmstrongNumberOrNot {

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
		
		double n=0;
		
		while(z!=0){
			int a=z%10;
			double d = Math.pow(a,c);
			n = n+d;
			z/=10;
		}
		
		if(n==x)
			System.out.println(x + " is a Armstrong Number");
		else
			System.out.println(x + " is NOT a Armstrong Number");

	}

}
