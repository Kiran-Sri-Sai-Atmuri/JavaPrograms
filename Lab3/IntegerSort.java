//	Write a java program to sort an Integer array.

package javaLab.Lab3;

import java.util.Arrays;

import java.util.Scanner;


public class IntegerSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of Integers : ");
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		System.out.println("Enter numbers : ");
		for(int i =0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<n-1 ;i++)
			for(int j=i+1 ; j<n ; j++) {
				if(arr[i]>arr[j]) {
					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
			
		
		System.out.println(Arrays.toString(arr));
	}

}
