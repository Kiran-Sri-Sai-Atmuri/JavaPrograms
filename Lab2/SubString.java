//	Write a java program to identify the total number of occurrences of the sub 
//	string. Here the String value is: “The problem is not the problem, the problem is 
//	your attitude about the problem do you understand!!” Substring is : “the”. You 
//	have to identify the total number of occurrences of substring and print the count. 


package javaLab.Lab2;

public class SubString {

	public static void main(String[] args) {
		String s = "The problem is not the problem, the problem is your attitude about the problem do you understand!!";
		int count =0;
		for(int i=0 ; i<s.length() -3; i++) {
			if((s.charAt(i) == 't' || s.charAt(i) == 'T') &&
				(s.charAt(i+1) == 'h' || s.charAt(i+1) == 'H') &&
				(s.charAt(i+2) == 'e' || s.charAt(i+2) == 'E'))
				count++;
		}
		
		System.out.println(count);

	}

}
