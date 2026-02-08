package javaLab.Lab3;

import java.util.Scanner;

public class Manager extends Employee {

	
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
		
		Manager man = new Manager();
		man.setEmp_code(emp_code);
		man.setEmp_name(emp_name);
		man.setAddress(emp_address);
		man.setPh_no(emp_phno);
		System.out.print("Enter Manager basic pay :  ");
		double basicpay = sc.nextDouble();
		double da = basicpay*0.1;
		double hra = basicpay*0.2;
		double salary=basicpay + da + hra;
		System.out.println("Employee salary : "+salary);
		sc.close();
	}

}
