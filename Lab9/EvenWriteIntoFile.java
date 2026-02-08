package javaLab.Lab9;

import java.io.FileWriter;
import java.io.IOException;

public class EvenWriteIntoFile extends Thread{

	EvenNumber en;
	
	
	public EvenWriteIntoFile(EvenNumber en) {
		this.en = en;
	}


	@Override
	public void run() {
		while(true) {
			
			try {
				int evenNum = en.pop();
				FileWriter fw = new FileWriter("even.txt",true);
				fw.write(String.valueOf(evenNum)+"\n");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
