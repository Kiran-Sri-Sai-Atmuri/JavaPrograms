package javaLab.Lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		int ch;
		int charcount = 0;
		int wordCount = 1;
		boolean flag = true;
		int lines = 1;
		int specialChar =0;
		int digit = 0;
		int space = 0;
		while((ch= br.read())!=-1) {
			charcount++;
			if(ch==' ' || ch == '\n' || ch == '\t') {
				flag = false;
				
			}
			else {
				if(!flag) {
					wordCount ++;
					flag = true;
				}
			}
			
			if(ch == '\n') {
				lines++;
			}
			
			if(!Character.isLetterOrDigit(ch) && ch!=' ' && ch!='\n' && ch!='\t')
				specialChar ++;
			if(ch == ' ' || ch =='\t')
				space++;
			if(Character.isDigit(ch))
				digit++;
		}
		
		System.out.println("Number of characters : "+charcount);
		System.out.println("Number of words : "+wordCount);
		System.out.println("Number of lines : "+lines);
		System.out.println("Number of special characters : "+specialChar);
		System.out.println("Number of spaces : "+space);
		System.out.println("Number of digits : "+digit);
		
		
	}

}
