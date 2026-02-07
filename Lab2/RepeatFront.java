//	Given a string and an int N, return a string made of the first N characters of 
//	the string, followed by the first N-1 characters of the string, and so on. You may 
//	assume that N is between 0 and the length of the string, inclusive (i.e. N>=0 and N 
//	<= str.length())

package javaLab.Lab2;

import java.util.Scanner;

public class RepeatFront {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String name = sc.nextLine();
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		while(n!=-1) {
			System.out.print(name.substring(0,n));
			n--;
		}
		
		sc.close();
	}
}
