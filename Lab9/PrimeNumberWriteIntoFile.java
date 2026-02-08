package javaLab.Lab9;

import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumberWriteIntoFile extends Thread{

	PrimeNumber pm;
	
	
	
	
	public PrimeNumberWriteIntoFile(PrimeNumber pm) {
		this.pm = pm;
	}




	@Override
	public void run() {
		while(true) {
			
			try {
				int num = pm.pop();
				System.out.println(num);
				FileWriter fw = new FileWriter("prime.txt",true);
				fw.write(String.valueOf(num) + "\n");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
