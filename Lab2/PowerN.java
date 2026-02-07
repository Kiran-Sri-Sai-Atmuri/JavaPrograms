//	Given base and n that are both 1 or more, compute recursively (no loops), 
//	the value of base to the n power, so powerN(3, 2) is 9 (3 squared)

package javaLab.Lab2;

import java.util.Scanner;

public class PowerN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Base Number : ");
		int n = sc.nextInt();
		System.out.print("Enter Power : ");
		int p = sc.nextInt();
		
		System.out.println("Power "+p+" of "+n+" is : "+ powerN(n,p));
		
		sc.close();
	}

	private static int powerN(int n, int p) {
		if(p==1)
			return n;
		
		return powerN(n*n,p-1);
	}

}
