//	We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, 
//	..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, 
//	because they each have a raised foot. Recursively return the number of "ears" in 
//	the bunny line 1, 2, ... n (without loops or multiplication)

package javaLab.Lab2;

import java.util.Scanner;

public class BunnyEars {
	static int ears;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of Bunnies : ");
		int n = sc.nextInt();
		System.out.println("Total Ears : " + bunnyEars(n));
		sc.close();
	}

	private static int bunnyEars(int n) {
		if(n == 0)
			return ears;
		if(n%2==0)
			ears += 3;
		else 
			ears +=2;
		
		return bunnyEars(n-1);
	}

}
