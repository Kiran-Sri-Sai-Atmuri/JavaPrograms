//	Here I have a string value. You have to split that string into tokens. Store each 
//	token into a String array. You have to print all even index values from that array. 
//	The String is :”SACHIN TENDULKAR IS MASTER LEGEND” 

package javaLab.Lab2;

import java.util.Arrays;

public class StringToken {

	public static void main(String[] args) {
		String str = "SACHIN TENDULKAR IS MASTER LEGEND";
		String[] strarry = new String[5];
		int j=0;
		int start=0;
		int end=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ' || i == str.length()-1) {
				if(i == str.length()-1)
					end++;
				strarry[j] = str.substring(start,end);
				start=end;
				j++;
				
			}
			end++;
		}
		System.out.println(Arrays.toString(strarry));

	}

}
