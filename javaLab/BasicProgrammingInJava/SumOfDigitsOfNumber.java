// java program to find the Sum of digits of given number

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int n = num;
		int sum = 0;
		while(n!=0) {
			int x = n%10;
			sum+=x;
			n/=10;
		}
		
		System.out.println("Sum of digits of '" + num +"' is : "+sum);

	}

}
