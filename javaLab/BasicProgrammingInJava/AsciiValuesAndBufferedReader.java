// java program for print the ASCII values and read a different type of input from user using BufferedReader class 

package javaLab.BasicProgrammingInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AsciiValuesAndBufferedReader {

	public static void main(String[] args) throws IOException {
		
		
		// Ascii values
		System.out.print("Enter a character : ");
		
		char ch = new Scanner(System.in).next().charAt(0);
		
		int c=ch;
		
		System.out.println("ASCII valur Of "+ ch +" is :" +  c);
		
		
		// Taking input using BufferedReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your name : ");
		
		String name = reader.readLine();
		
		System.out.println("Hello "+name);
	}

}
