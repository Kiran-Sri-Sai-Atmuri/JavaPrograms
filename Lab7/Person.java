package javaLab.Lab7;

public class Person {
	String name;
	int  age;
	
	void check() throws NumericException {
		for(int i = 0 ; i<name.length() ; i++) {
			if(name.charAt(i)>='0' && name.charAt(i)<='9')
				throw new NumericException();
		}
		
	}
}
