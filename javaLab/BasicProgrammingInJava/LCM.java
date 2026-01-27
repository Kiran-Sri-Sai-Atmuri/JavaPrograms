//  java program to find the LCM of two numbers

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int lcm = Math.max(n1, n2);
		int flag=0;
		
		while(flag==0) {
			
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println("LCM of "+n1 +" and "+n2 +" is "+lcm);
				flag=1;
			}
			lcm++;
		}
		

	}

}
