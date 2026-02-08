package javaLab.Lab9;

import java.io.FileWriter;
import java.io.IOException;


public class HOD extends Thread {
	StudentOutPass sop;
	public HOD(StudentOutPass sop) {
		this.sop = sop;
	}
	
	
	
	



	static int i = 1;
	public HOD() {
		i++;
	}
	@Override
	public void run() {
		
		while(i<=DemoStudentOutPass.n){
			try {
				String details = sop.pop();
				FileWriter fw = new FileWriter("studentOutPass.txt",true);
				fw.write(details + "\n");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				i++;
			}
			
		}
		
	}
	
}
