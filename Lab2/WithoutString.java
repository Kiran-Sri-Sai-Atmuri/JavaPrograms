//	Given two strings, base and remove, return a version of the base string where 
//	all instances of the remove string have been removed (not case sensitive). You may 
//	assume that the remove string is length 1 or more. Remove only non-overlapping 
//	instances, so with "xxx" removing "xx" leaves "x". 

package javaLab.Lab2;

import java.util.Scanner;

public class WithoutString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String sup =sc.nextLine();
		
		System.out.print("Enter sub String : ");
		String sub = sc.nextLine();
	
		sup =sup.replace(sub, "");
		
		System.out.println(sup);
	
		sc.close();

	}

}
