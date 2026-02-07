//  Given an array of strings, return a new array containing the first N strings.
//	N will be in the range 1..length.

package javaLab.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class WordsFont {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in array : ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[n];
		
		System.out.println("Enter elements in the array : ");
		
		for(int i=0;i<arr.length;i++) 
			arr[i] = sc.nextLine();
		
		System.out.print("Enter Length : ");
		int length = sc.nextInt();
		
		String[] arr2 = new String[length];
		for(int i=0;i<length;i++)
			arr2[i] = arr[i];
		
		
		System.out.println(Arrays.toString(arr2));
		sc.close();
			
		
		

	}

}
