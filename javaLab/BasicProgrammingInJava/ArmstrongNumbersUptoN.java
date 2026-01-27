//  java program to Print the Amstrong numbers up to the given range

package javaLab.BasicProgrammingInJava;

import java.util.Scanner;

public class ArmstrongNumbersUptoN {

	public static void main(String[] args) {
		
		System.out.print("Enter a number : ");
		
		int range = new Scanner(System.in).nextInt();
		
		System.out.print("Armstrong Numbers are : ");
		
		for(int i=1;i<=range;i++) {
			if(armstrong(i))
				System.out.print(i + " ");
		}
	}
		public static boolean armstrong(int x) {
			
			int y=x;
			int z=x;
			int c=0;
			
			while(y!=0) {
				c++;
				y/=10;
			}
			
			double n=0;
			
			while(z!=0){
				int a=z%10;
				double d = Math.pow(a,c);
				n = n+d;
				z/=10;
			}
			
			if(n==x)
				return true;
			else 
				return false;
		}
}
