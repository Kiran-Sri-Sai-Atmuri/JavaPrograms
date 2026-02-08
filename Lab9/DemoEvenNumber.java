package javaLab.Lab9;

public class DemoEvenNumber {

	public static void main(String[] args) {
		EvenNumber en = new EvenNumber();
		EvenThread et = new EvenThread(en);
		EvenWriteIntoFile ewi = new EvenWriteIntoFile(en);
		
		et.start();
		ewi.start();

	}

}
