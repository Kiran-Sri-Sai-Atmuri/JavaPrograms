package javaLab.Lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) throws PercentageException, IOException {
		Scanner sc = new Scanner(System.in);
		try (BufferedReader bf = new BufferedReader(new FileReader("student.txt"))) {
			String name;
			int age;
			float percentage;
			System.out.print("Enter student name : ");
			name = sc.nextLine();
			System.out.print("Enter student age : ");
			age = sc.nextInt();
			System.out.print("Enter student percentage : ");
			percentage = sc.nextFloat();
			
			if(percentage < 50)
				throw new PercentageException();
			else {
				String existing = "";
				String str = null;
				while((str=bf.readLine() )!=null) {
					existing+=str+"\n";
					
				}
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"))) {
					bw.write(existing +"\nname : "+name+" age : "+age +" percentage : "+percentage);
					bw.close();
				}
				
			}
			sc.close();
		}
	}
}
