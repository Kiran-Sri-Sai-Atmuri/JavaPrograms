//	Return true if the given string contains a "bob" string, but where the middle 
//	'o' char can be any char.

package javaLab.Lab2;

import java.util.Scanner;

public class BobThere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String name = sc.nextLine();
		
		boolean flag = false;
		for(int i=0;i<name.length()-2;i++)
			if(name.charAt(i) == 'b' && name.charAt(i+2) == 'b') {
				flag = true;
			}
		
		System.out.println(flag);
		
		sc.close();

	}

}
