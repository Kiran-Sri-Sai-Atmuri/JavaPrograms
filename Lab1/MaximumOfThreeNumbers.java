//  java program to Find maximum of three numbers

package javaLab.Lab1;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers : ");
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		
		
		if(a>b  && a>c) 
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + a);
		
		else if(b>a && b>c)
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + b);
		
		else if(c>a && c>b)
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + c);
		
		else if(a==b && b==c) {
			System.out.println("All are equal");
		}
		else if(a==b && a>c)
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + a);
		else if(a==b && a<c)
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + c);
		else if(b==c && b>a)
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + b);
		else if(b==c && b<a)
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + a);
		else if(a==c && a>b)
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + a);
		else
			System.out.println("Maximum of " + a +"," + b +","+ c +"," +" is : " + b);
		
	}

}
