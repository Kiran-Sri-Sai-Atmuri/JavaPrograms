package javaLab.Lab9;

public class EvenNumber {

	int evenNum;
	boolean available = true;
	public synchronized void push(int evenNum) {
		while(!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.evenNum = evenNum;
		available = false;
		notify();
	}
	
	public synchronized int pop() {
		
		while(available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		available = true;
		notify();
		return this.evenNum;
	}
}
