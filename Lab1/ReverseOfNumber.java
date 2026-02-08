//  java program to print the reverse of a given number

package javaLab.Lab1;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int x=num;
		int y=x;
		int c=0;
		
		while(y!=0) {
			c++;
			y/=10;
		}
		
		int n=0;
		
		for(int i=0;i<c;i++) {
			int a = x%10;
			n=(n*10)+(a);
			x/=10;
		}
		
		
		System.out.println("Reverse of '" + num +"' is : "+ n);

	}

}
