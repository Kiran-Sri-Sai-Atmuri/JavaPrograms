//	write a java program that look for patterns like “ram” and “rom” in the string – length should be 3, starting with „r‟ and ending with „m‟. You have to return a 
//	string where for all such words, the middle letter is gone, and so 
//	“ramXrom” yields “raXrm”

package javaLab.Lab2;

import java.util.Scanner;

public class RmPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str1 = sc.nextLine();
		StringBuffer str = new StringBuffer(str1);
		
		for(int i=0 ; i <str.length() ; i++) {
			if((str.charAt(i)=='r' || str.charAt(i) == 'R') &&( str.charAt(i+2)=='m' || str.charAt(i+2) == 'M'))
				str.replace(i+1, i+2, "");
		}
		System.out.println(str);
		
		sc.close();
	}

}
