package javaLab.Lab9;

public class OddThread extends Thread{
	
	OddNumber on;
	
	
	
	public OddThread(OddNumber on) {
		super();
		this.on = on;
	}



	@Override
	public void run() {
		
		int i=1 ; 
		while(i>0) {
			if(i%2!=0) {
				on.push(i);
			}
			i++;
		}
	}
}
