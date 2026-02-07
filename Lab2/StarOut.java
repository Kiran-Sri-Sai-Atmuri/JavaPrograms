//	Return a version of the given string, where for every star (*) in the string the 
//	star and the chars immediately to its left and right are gone. So "ab*cd" yields 
//	"ad" and "ab**cd" also yields "ad"

package javaLab.Lab2;

import java.util.Scanner;

public class StarOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String name = sc.nextLine();
		int start = 0;
		int end=0;
		StringBuffer str = new StringBuffer(name);
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == '*') {
				if(i == 0 ) {
					start = 0;
					end = 1;
				}
				else if( i == str.length()-1) {
					start = str.length()-2;
					end = str.length()-1;
					
				}
					
				else {
				start = i-1;
				while(str.charAt(start)=='*') {
					if(start == 0)
						break;
					start--;
				}
				end=i+1;
				while(str.charAt(end)=='*') {
					if(end == str.length()-1)
						break;
					end--;
				}
				}
				
			}
		}
		
		str.replace(start, end+1, "");
		System.out.println(str);
		sc.close();
	}

	}

