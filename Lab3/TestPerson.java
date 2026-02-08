//	Write sample code for creating Person object array to store persons data. 
//	Implement Person class with name, age and a toString method. Create 
//	necessary classes to store data in object array 


package javaLab.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class TestPerson{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of persons : ");
		int n = sc.nextInt();
		Person[] persons = new Person[n];
		for(int i=0 ; i<n ; i++) {
			
			System.out.print("Enter "+(i+1)+" persons name : ");
			String name = sc.nextLine();
			sc.next();
			System.out.print("Enter "+(i+1)+" persons age : ");
			int age = sc.nextInt();
			Person person = new Person();
			person.name= name;
			person.age = age;
			persons[i] = person;
		}
		
		System.out.println(Arrays.toString(persons));
	}
}

class Person {
	String name;
	int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
