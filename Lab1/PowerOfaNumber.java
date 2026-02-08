//  java program to find the Power of a number 

package javaLab.Lab1;

import java.util.Scanner;

public class PowerOfaNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int a =sc.nextInt();
		
		System.out.print("Enter power : ");
		int b =sc.nextInt();
		int power = a;
		
		for(int i=1 ; i<b ;i++)
			power*=power;
		
		System.out.println(a +"^"+b +" is : "+power);

	}

}
