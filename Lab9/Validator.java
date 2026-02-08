package javaLab.Lab9;

import java.io.FileWriter;
import java.io.IOException;

public class Validator extends Thread {
	Student s;
	
	public Validator(Student s) {
		this.s = s;
	}



	public void validate(int age) throws AgeException  {
		if(age > 23 && age < 35) {
		
			throw new AgeException("Invalid age : " +age);
			
			
		}
	}
	
	

	public void run() {
		
		for(int i = 1 ; i<=new DemoStudent().n ;i++) {
			
			try {
				String student = s.pop();
				int age = s.getAge();
				validate(age);
				FileWriter fw = new FileWriter("studentThread.txt",true);
				fw.write(student+"\n");
				fw.close();
				
			} 
			catch (AgeException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
