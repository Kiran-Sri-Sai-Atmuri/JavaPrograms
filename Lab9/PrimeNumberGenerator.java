package javaLab.Lab9;

public class PrimeNumberGenerator extends Thread{

	PrimeNumber pm;
	
	
	
	public PrimeNumberGenerator(PrimeNumber pm) {
		this.pm = pm;
	}



	



	@Override
	public void run() {
		int num = 2;
		while(num>0) {
			int flag = 1;
			for(int i = 2 ; i< num ; i++) {
				if(num%i==0)
					flag = 0;
			}
			
			if(flag == 1) {
				pm.push(num);
			}
			num++;
		}
		
	}
	
	
}
