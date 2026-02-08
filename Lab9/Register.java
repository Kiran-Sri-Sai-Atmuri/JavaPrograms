package javaLab.Lab9;

import java.util.Scanner;

public class Register extends Thread{
	
	Student s;

	public Register(Student s) {
		this.s = s;
	}
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		
		for(int i=1 ; i<=new DemoStudent().n;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ew) {
				ew.printStackTrace();
			}
			System.out.print("Enter name : ");
			String name  = sc.nextLine();
			System.out.print("Enter age  : ");
			int age = sc.nextInt();
			sc.nextLine();
			s.push(name, age);
			
		}
		
	}
	
	
}
