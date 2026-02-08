package javaLab.Lab9;

import java.io.FileWriter;
import java.io.IOException;

public class OddWriteIntoFile extends Thread {
	OddNumber on ;
	
	
	public OddWriteIntoFile(OddNumber on) {
		this.on = on;
	}


	@Override
	public void run() {
		while(true) {
			
			try {
				int oddNum = on.pop();
				FileWriter fw = new FileWriter("odd.txt",true);
				fw.write(String.valueOf(oddNum)+"\n");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
