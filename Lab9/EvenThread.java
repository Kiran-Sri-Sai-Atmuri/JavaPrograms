package javaLab.Lab9;

public class EvenThread extends Thread{

	
	EvenNumber en;	
	public EvenThread(EvenNumber en) {
		this.en = en;
	}


	@Override
	public void run() {
		
		int i=1 ; 
		while(i>0) {
			if(i%2==0) {
				en.push(i);
			}
			i++;
		}
	}
	
}
