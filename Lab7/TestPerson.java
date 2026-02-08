package javaLab.Lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) throws IOException {
		Scanner sc  = new Scanner(System.in);
		Person p = new Person();
		System.out.print("Enter person name : ");
		p.name= sc.nextLine();
		System.out.print("Enter person age : ");
		p.age = sc.nextInt();
		BufferedReader bf = new BufferedReader(new FileReader("person.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("person.txt"));
		try {
			p.check();
		} catch (NumericException e) {
			System.exit(1);
		}
		
		String existing = "";
		String str = null;
		
		while((str=bf.readLine())!=null) {
			existing+=str+"\n";
		}
		
		bw.write(existing +"\nname : "+p.name+" age : "+p.age );
	 
	    bw.close();
		sc.close();
			
		
	}

}
