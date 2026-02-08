package javaLab.Lab9;

public class PrimeNumber {

	int primeNumber;
	boolean available = false;
	
	public synchronized void push(int primeNumber) {
		while(available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.primeNumber = primeNumber;
		available = true;
		notify();
		
	}
	
	public synchronized int pop() {
		while(!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		available = false;
		notify();
		return primeNumber;
	}

}
