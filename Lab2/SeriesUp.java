//	Write your code in “MaxMirror.java” file. 13. Given n>=0, create an array 
//	with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} (spaces added to show the grouping). 
//	Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to 
//	exactly n*(n + 1)/2


package javaLab.Lab2;

import java.util.Arrays;

import java.util.Scanner;

public class SeriesUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		int len = (n*(n+1))/2;
		int pos =0;
		int[] arr = new int[len];
		for(int i=1 ;i<=n ;i++) {
			for(int j=1;j<=i;j++) {
				arr[pos] = j;
				pos++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

}
