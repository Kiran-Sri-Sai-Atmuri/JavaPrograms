package javaLab.Lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestVoter {
	public static void main(String[] args) throws IOException {
		Scanner sc  = new Scanner(System.in);
		Voter v = new Voter();
		System.out.print("Enter person name : ");
		v.name= sc.nextLine();
		System.out.print("Enter person age : ");
		v.age = sc.nextInt();
		
		BufferedReader bf = new BufferedReader(new FileReader("voter.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("voter.txt"));
		boolean flag = true;
		try {
			v.check();
		} catch (Exception e) {
			flag = false;
		}
		if(flag) {
		
		String existing = "";
		String str = null;
		
		while((str=bf.readLine())!=null) {
			existing+=str+"\n";
		}
		
		bw.write(existing +"\nname : "+v.name+" age : "+v.age );
	    
	    bw.close();
		sc.close();
		}
		
	}
}
