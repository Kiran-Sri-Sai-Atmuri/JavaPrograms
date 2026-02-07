//	We'll say that a "triple" in a string is a char appearing three times in a 
//	row. Return the number of triples in the given string. The triples may overlap

package javaLab.Lab2;

import java.util.Scanner;

public class CountTriple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		int count =0;
		for(int i=0;i<str.length()-2;i++)
			if((str.charAt(i) == str.charAt(i+1)) && (str.charAt(i) == str.charAt(i+2)))
				count++;
		
		
		System.out.println(count);
		
		sc.close();
		
	}
}
