//	 Start with two arrays of strings, A and B, each with its elements in alphabetical 
//	order and without duplicates. Return a new array containing the first N elements 
//	OOPS through JAVA Laboratory 
//	from the two arrays. The result array should be in alphabetical order and 
//	without duplicates. A and B will both have a length which is N or more. The best 
//	"linear" solution makes a single pass over A and B, taking advantage of the fact 
//	that they are in alphabetical order, copying elements directly to the new array. 

package javaLab.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] A = {"a","c","z"};
		String[] B = {"b","f","z"};
		
		System.out.print("Enter length : ");
		int length = sc.nextInt();
		String[] C = new String[length];
		int x=0,y=0;
		for(int i=0 ; i<length ; i++) {
			if(A[x].charAt(0) < B[y].charAt(0)) {
				C[i]=A[x];
			    x++;
			}
			else if(A[x].charAt(0)>B[y].charAt(0)) {
				C[i] = B[y];
				y++;
			}
			else {
				C[i]=A[i];
				x++;
				y++;
			}
		}
		
		System.out.println(Arrays.toString(C));
		
		sc.close();
		
	}

}
