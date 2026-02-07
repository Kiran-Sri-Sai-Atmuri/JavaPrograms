//	Returns true if for every „*‟ (star) in the string, if there are chars 
//	both immediately before and after the star, they are the same 

package javaLab.Lab2;

import java.util.Scanner;

public class SameStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == '*') {
				if(str.charAt(i-1) == str.charAt(i+1))
					System.out.println("true");
				else
					System.out.println("false");
			}
		}
		sc.close();

	}

}
