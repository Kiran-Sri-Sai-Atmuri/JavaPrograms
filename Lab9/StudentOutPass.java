package javaLab.Lab9;

public class StudentOutPass {
	String roll_No;
	int max_Leave_Days;
	String reason;
	
	boolean available = false;
	
	public synchronized void push(String roll_No,int max_Leave_Days,String reason) {
		while(available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.roll_No = roll_No;
		this.max_Leave_Days = max_Leave_Days;
		this.reason = reason;
		
		available = true;
		notify();
		
	}
	
	
	public synchronized String pop() {
		while(!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		available = false;
		
		notify();
		return toString();
		
	}


	@Override
	public String toString() {
		return roll_No + "," + max_Leave_Days + "," + reason;
	}
	
	
	
	
}
