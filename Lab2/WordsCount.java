// Given an array of strings, return the count of the number of strings with the 
//	given length

package javaLab.Lab2;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in array : ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[n];
		
		System.out.println("Enter elements in the array : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextLine();
		}
	
		System.out.print("Enter Length : ");
		
		int length = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
			if(arr[i].length() == length)
				count++;
		
		System.out.println("No.of String with length " + length + " are : "+count);
		
		sc.close();
			

	}

}
