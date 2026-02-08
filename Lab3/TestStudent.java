package javaLab.Lab3;

public class TestStudent {

	public static void main(String[] args) {
		Grad grad = new Grad();
		grad.name = "pardhu";
		grad.id = 7;
		grad.age = 17;
		grad.address = "vuyyuru";
		grad.grade = 66;
		System.out.println("is Passed : "+grad.isPassed(grad.grade));
		
		Undergrad ug = new Undergrad();
		ug.name = "kiran";
		ug.id = 1;
		ug.age = 18;
		ug.address = "Thotlavalluru";
		ug.grade = 44;
		System.out.println("is Passed : "+ug.isPassed(ug.grade));
		
	}

}
