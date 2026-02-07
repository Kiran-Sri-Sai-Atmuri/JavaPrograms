//	Given an array of ints of even length, return a new array length 2 containing 
//	the middle two elements from the original array. The original array will be length 
//	2 or more

package javaLab.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class MakeMiddle {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] a = new int[n];
		System.out.println("Enter elements in first array : ");
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		
		
		int[] m = new int[2];
		
		m[0] = a[((a.length)/2)-1];
		m[1] = a[((a.length)/2)];
		
		System.out.println(Arrays.toString(m));
		
		sc.close();
		

	}

}
