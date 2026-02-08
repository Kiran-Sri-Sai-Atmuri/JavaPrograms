package javaLab.Lab3;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of rows in first array : ");
		int r1 = sc.nextInt();
		System.out.print("Enter no.of cols in first array : ");
		int c1 = sc.nextInt();
		System.out.print("Enter no.of rows in second array : ");
		int r2= sc.nextInt();
		System.out.print("Enter no.of cols in second array : ");
		int c2 = sc.nextInt();
		
		sc.nextLine();
		int[][] arr1 = new int[r1][c1];
		int[][] arr2 = new int[r2][c2];
		int[][] mul = new int[c1][r2];
		
		
		System.out.println("Enter Elements in the FIRST array : ");
		for(int i=0 ; i<r1 ; i++) {
			for(int j=0 ; j<c1 ; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter Elements in the SECOND array : ");
		for(int i=0 ; i<r1 ; i++) {
			for(int j=0 ; j<c1 ; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				mul[i][j]=0;
				for(int k=0;k<c1;k++) {
					mul[i][j] = mul[i][j]+(arr1[i][k]*arr2[k][j]);
				}
			}
		}
		
		System.out.println("Resultant Array : ");
		for(int i=0;i<c1;i++) {
			for(int j=0;j<r2;j++) {
				System.out.print(mul[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
