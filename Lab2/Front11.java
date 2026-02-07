//	Given 2 int arrays, a and b, of any length, return a new array with the 
//	first element of each array. If either array is length 0, ignore that array. 


package javaLab.Lab2;

import java.util.Scanner;

public class Front11 {
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
		
		if(a.length == 0)
			System.out.println("{"+b[0]+"}");
		if(b.length == 0)
			System.out.println("{"+a[0]+"}");
		if(a.length != 0 && b.length != 0)
			System.out.println("{"+a[0]+","+b[0]+"}");
		
		sc.close();
	}
}
