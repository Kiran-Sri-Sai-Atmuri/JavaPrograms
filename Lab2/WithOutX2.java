//	Given a string, if one or both of the first 2 chars is 'x', return the string 
//	without those 'x' chars, and otherwise return the string unchanged.

package javaLab.Lab2;

import java.util.Scanner;

public class WithOutX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String name = sc.nextLine();
		
		if(name.charAt(0) == 'x' || name.charAt(0) == 'X') 
			name=name.substring(1);
		
		
		if(name.charAt(1) == 'x' || name.charAt(1) == 'X') 
			name=name.replace("x","");
		
		
		System.out.println(name);
		
		sc.close();
		
				
	}
}
