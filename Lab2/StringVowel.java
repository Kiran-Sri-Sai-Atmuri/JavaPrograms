//	Write a program to substitute the vowels present in a string 
//	i. 
//	For example if I enter: I am happy 
//	ii. 
//	iii. 
//	iv. 
//	ii. First it has to search for the vowels and display that the vowels are 
//	:I, a,a 
//	Then it has to substitute the vowels by a , e, I, o, u by b, f, j,p,v 
//	The changed string is: j bm hbppy 


package javaLab.Lab2;

import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		for(int k=0 ; k<str.length() ; k++ ) {
			if(str.charAt(k) == 'a' || str.charAt(k) == 'e' || str.charAt(k) == 'o' || str.charAt(k) == 'u' || str.charAt(k) == 'i' ||
					str.charAt(k) == 'A' || str.charAt(k) == 'E' || str.charAt(k) == 'O' || str.charAt(k) == 'U' || str.charAt(k) == 'I') {
				str= str.replace(str.charAt(k), (char)(str.charAt(k)+1));
			}
		}
		
		System.out.println(str);
		
		sc.close();

	}

}
