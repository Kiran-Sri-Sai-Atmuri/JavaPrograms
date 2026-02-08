package javaLab.Lab7;

import java.util.Scanner;

public class TestNumbercheck {

	public static void main(String[] args) throws PrimeException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		new NumberCheck().numCheck(n);
		
		sc.close();
	}

}
