package javaLab.Lab3;

public abstract class Student {
	
	String name;
	int id;
	float grade;
	int age;
	String address;
	
	public abstract boolean isPassed(float grade);

}


class Undergrad extends Student{

	@Override
	public boolean isPassed(float grade) {
		if(grade>70)
			return true;
		return false;
	}
}

class Grad extends Student{

	@Override
	public boolean isPassed(float grade) {
		if(grade>80)
			return true;
		return false;
	}
	
	
}
