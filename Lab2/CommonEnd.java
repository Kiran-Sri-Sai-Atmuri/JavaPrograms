//	Given 2 arrays of ints, A and B, return true if they have the same first element 
//	or they have the same last element. Both arrays will be length 1 or more.

package javaLab.Lab2;

import java.util.Scanner;

public class CommonEnd {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter length of First array : ");
		int n1 = sc.nextInt();
		System.out.print("Enter length of First array : ");
		int n2 = sc.nextInt();
		
		
		int[] a = new int[n1];
		int[] b = new int[n2];
		
		System.out.println("Enter elements in first array : ");
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter elements in second array : ");
		for(int i=0 ; i<b.length ; i++) {
			b[i] = sc.nextInt();
		}
		
		
		if(a[0] == b[0] )
			System.out.println("first element is common : "+ a[0]);
		
		if(a[a.length-1] == b[b.length-1])
			System.out.println("last element is common : "+a[a.length-1]);
		
		sc.close();
	}

}
