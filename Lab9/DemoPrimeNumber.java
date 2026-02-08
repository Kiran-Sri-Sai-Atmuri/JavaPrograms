package javaLab.Lab9;

public class DemoPrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		PrimeNumberGenerator pmg = new PrimeNumberGenerator(pm);
		PrimeNumberWriteIntoFile pwf = new PrimeNumberWriteIntoFile(pm);
		
		pmg.start();
		pwf.start();

	}

}
