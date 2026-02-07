//Return an array that contains the exact same numbers as the given array, but 
//rearranged so that all the zeros are grouped at the start of the array. The order of 
//the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may 
//modify and return the given array or make a new array. 

package javaLab.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroFront {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of Elements in the Array : ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		
		System.out.println("Enter elements in the array : ");
		for(int i=0 ; i<n ; i++)
			a[i] = sc.nextInt();
		int count = 0;
		for(int i=0 ; i<a.length ;i++) {
			if(a[i] == 0) {
				int temp = a[i] ;
				 a[i] = a[count];
				 a[count] = temp;
				 count++;
				}
		}
		System.out.println(Arrays.toString(a));
		
		sc.close();
	}

}
