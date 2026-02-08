package javaLab.Lab9;

public class Student {
	String name;
	int age;
	
	int present = 0;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		
	}

	public synchronized void push(String name, int age) {
		while(present == 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.name = name;
		this.age = age;
		present = 1;
		notify();
		
		
	}
	
	public synchronized String pop() {
		while(present == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		present = 0;
		notify();
		return toString();
	}

	@Override
	public String toString() {
		return name + "," + age ;
	}

	public int getAge() {
		
		return age;
	}
	
	
	
}
