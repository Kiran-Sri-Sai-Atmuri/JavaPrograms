package javaLab.Lab7;

public class Voter {

	
	String name;
	int age;
	
	void check() throws AgeException {
		if(age<18)
			throw new AgeException();
	}
}
