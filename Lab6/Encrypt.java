package javaLab.Lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		System.out.print("Enter shift value : ");
		int n = new Scanner(System.in).nextInt();
		String s = "";
		String encrypted = "";
		while((s = br.readLine())!=null) {
			encrypted += encrypt(s,n)+"\n";
		}
		FileWriter fw = new FileWriter("encrypt.txt");
		fw.write(encrypted);
		fw.close();
		
		System.out.println("Succesfully encrypted ...");
		
	}
	public static String encrypt(String str , int key) {
		String result = "";
		for(int i = 0 ; i<str.length() ; i++) {
			
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
				ch = (char)((ch - 'a' + key +26)%26 +'a');
			else if(ch >= 'A' && ch <= 'Z')
				ch = (char)((ch - 'A' + key +26)%26 +'A');
			
			result+=ch;
		}
		
		return result;
	}

}
