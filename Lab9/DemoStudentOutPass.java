package javaLab.Lab9;

import java.util.Scanner;

public class DemoStudentOutPass {
	
	static int n;

	public static void main(String[] args) {
		System.out.println("Enter no.of students : ");
		n = new Scanner(System.in).nextInt();
		StudentOutPass sop = new StudentOutPass();
		HOD hod = new HOD(sop);
		ASWO aswo = new ASWO(sop);
		hod.start();
		aswo.start();
	}
}
