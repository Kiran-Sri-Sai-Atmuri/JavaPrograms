//	Given an array of ints, return true if the value 3 appears in the array exactly 
//	3 times, and no 3's are next to each other. 

package javaLab.Lab2;

import java.util.Scanner;

public class HaveThree {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		
		
		int[] a = new int[n];
		
		System.out.println("Enter elements in array : ");
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		
		for(int i=0 ; i<n-2 ; i++) {
			if(a[i] == 3 && a[i+2] == 3)
				count++;
		}
		
		if(count == 2)
			System.out.println("true");
		else
			System.out.println("false");
		
		sc.close();
	}
}
