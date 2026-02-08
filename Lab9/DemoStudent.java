package javaLab.Lab9;

import java.util.Scanner;

public class DemoStudent {
	static int n;
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("Enter no.of students to add : ");
		n = new Scanner(System.in).nextInt();
		Register r = new Register(s);
		Validator v = new Validator(s);
		
		r.start();
		v.start();
		
	}

}
