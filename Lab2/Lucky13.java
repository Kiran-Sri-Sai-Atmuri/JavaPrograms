//	Given an array of ints, return true if the array contains no 1's and no 3's.

package javaLab.Lab2;

import java.util.Scanner;

public class Lucky13 {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		
		
		int[] a = new int[n];
		
		System.out.println("Enter elements in first array : ");
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		boolean flag = true;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i] == 1 || a[i] == 3)
				flag = false;
		}
		
		System.out.println(flag);
		
		sc.close();
	}
}
