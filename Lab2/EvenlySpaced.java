//	 Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are 
//	evenly spaced, so the difference between small and medium is the same as the 
//	difference between medium and large.

package javaLab.Lab2;

import java.util.Scanner;

public class EvenlySpaced {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int first = a-b;
		int second=b-c;
		
		if(first<0)
			first*=-1;
		
		if(second<0)
			second*=-1;
		
		if(first == second)
			System.out.println("true");
		else
			System.out.println("false");
		
		sc.close();
	}

}
