//  Given a string, return a version where all the "x" have been removed.
//	Except an "x" at the very start or end should not be removed

package javaLab.Lab2;

import java.util.Scanner;

public class StringX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		
		String name = sc.nextLine();
		
		StringBuffer buffer = new StringBuffer(name);
		
		for(int i=1;i<buffer.length()-1;i++)
			if(buffer.charAt(i) == 'x')
				buffer.replace(i, i+1, "");
		
		System.out.println(buffer);
		
		sc.close();
		

	}

}
