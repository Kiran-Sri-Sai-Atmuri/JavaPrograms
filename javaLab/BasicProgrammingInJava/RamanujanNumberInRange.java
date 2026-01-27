//  java program to print the Ramanujan numbers from the given range

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class RamanujanNumberInRange {

	public static void main(String[] args) {
		
		System.out.print("Enter a range : ");
		
		int range = new Scanner(System.in).nextInt();
		
		System.out.println("Ramanujan Numbers are : ");
		for(int i=1;i<=range;i++) {
			if(isRamanujan(i))
				System.out.print(i);
		}
	}

	private static boolean isRamanujan(int n) {
		
		int count=0;
		
		for(int a=1;a*a*a <n;a++)
		{
			for(int b=a;b*b*b<n;b++) {
				int sum = a*a*a + b*b*b;
				if(sum==n) {
					count++;
					if(count>=2) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
