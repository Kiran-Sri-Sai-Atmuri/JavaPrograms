package javaLab.Lab9;

public class DemoOddNumber {
	public static void main(String[] args) {
		
		OddNumber on = new OddNumber();
		OddThread ot = new OddThread(on);
		OddWriteIntoFile owf = new OddWriteIntoFile(on);
		
		ot.start();
		owf.start();
	}
}
