//	Given a string that contains a single pair of parenthesis, compute recursively 
//	a new string made of only of the parenthesis and their contents, so “xyz(abc)123” 
//	yields “(abc)” 

package javaLab.Lab2;

import java.util.Scanner;

public class ParentBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str1 = sc.nextLine();
		StringBuffer str = new StringBuffer(str1);
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '(') {
				str.replace(0, i, "");
			}
			if(str.charAt(i) == ')')
				str.replace(i+1, str.length(), "");
		}
		
		System.out.println(str);
		
		sc.close();

	}

}
