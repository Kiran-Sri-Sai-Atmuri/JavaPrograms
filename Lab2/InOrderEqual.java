//	Given three ints, a b c, return true if they are in strict increasing order, such as 2 
//	5 11, or 5 6 7, but not 6 5 7. However, with the exception that if equalOk is 
//	true, equality is allowed, such as 5 5 7 or 5 5 5. 

package javaLab.Lab2;

import java.util.Scanner;

public class InOrderEqual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.print("Enter if equalOk (true or fales) : ");
		boolean equalOk = sc.nextBoolean();
		boolean result = false;
	
		if(equalOk)
			result = equal(a,b,c);
		else
			result = notEqual(a,b,c);
	
		System.out.println(result);
		
		sc.close();
	}

	private static boolean notEqual(int a, int b, int c) {
		if(a<b && b<c)
			return true;
		return false;
	}

	private static boolean equal(int a, int b, int c) {
		if(a<b && b<c)
			return true;
		else if(a==b && a>b)
			return false;
		else if(a==b && a<c)
			return true;
		else if(b==c && a>b)
			return false;
		else if(b==c && a<b)
			return true;
	
		return false;
	}

}
