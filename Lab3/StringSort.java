package javaLab.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of Integers : ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		System.out.println("Enter numbers : ");
		for(int i =0 ; i < n ; i++) {
			arr[i] = sc.nextLine();
		}
		for(int i=0; i<arr.length-1 ; i++) {
			for(int j = i+1 ; j<arr.length;j++) {
					if(arr[i].compareTo(arr[j]) > 0) {
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp; 
					}
		}
		}
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();

	}

}
