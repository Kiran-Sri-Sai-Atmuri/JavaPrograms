package javaLab.Lab3;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of Integers : ");
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		System.out.println("Enter numbers : ");
		for(int i =0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer,Integer> h = new HashMap<>();
		
		
		for(int i=0;i<5;i++) {
			if(h.containsKey(arr[i])) {
				int c = h.get(arr[i]);
				h.replace(arr[i],c,c++);
			}
			else
				h.put(arr[i],1);
		
		}
		
		System.out.println(h);
		
				
			
		}

	}


