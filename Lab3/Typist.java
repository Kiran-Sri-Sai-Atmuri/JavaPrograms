package javaLab.Lab3;

import java.util.Scanner;

public class Typist extends Employee {
	
	@Override
	public void computeSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee code : ");
		int emp_code = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee name : ");
		String emp_name = sc.nextLine();
		
		System.out.print("Enter Employee address : ");
		String emp_address = sc.nextLine();
		
		System.out.print("Enter Employee phone number : ");
		long emp_phno = sc.nextLong();
		sc.nextLine();
		Typist typ = new Typist();
		typ.setEmp_code(emp_code);
		typ.setEmp_name(emp_name);
		typ.setAddress(emp_address);
		typ.setPh_no(emp_phno);
		System.out.print("Enter Typist basic pay :  ");
		double basicpay = sc.nextDouble();
		double da = basicpay*0.1;
		double hra = basicpay*0.2;
		double salary=basicpay + da + hra;
		System.out.println("Employee salary : "+salary);
		sc.close();
	}


}
