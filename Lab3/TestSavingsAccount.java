//	Create class SavingsAccount. Use a static variable annualInterestRate to 
//	store the annual interest rate for all account holders. Each object of the class 
//	contains a private instance variable savingsBalance indicating the amount 
//	the saver currently has no deposit. Provide method calculateMonthlyInterest 
//	to calculate the monthly interest by multiplying the savingsBalance by 
//	annualInterestRate divided by 12. this interest should be added to 
//	savingsBalance. Provide a static method modifyInterestRate that sets the 
//	annualInterestRate to a new value. Write a program to test class 
//	SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2, 
//	with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate 
//	to 4%, then calculate the monthly interest and print the new balances for 
//	both savers. Then set the annualInterestRate to 5%, calculate the next 
//	month‟s interest and print the new balances for both savers.

package javaLab.Lab3;

public class TestSavingsAccount {

	public static void main(String[] args) {
		
		
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		
		SavingsAccount.annualIntrestRate = 0.04;
		
		System.out.println("Monthly intrest for saver 1 : "+saver1.calculateMonthlyInterest() +"\nTotal Balance of saver 1 : "+saver1.getSavingsBalance());
		System.out.println("Monthly intrest for saver 2 : "+saver2.calculateMonthlyInterest() +"\nTotal Balance of saver 2 : "+saver2.getSavingsBalance());
		
		SavingsAccount.annualIntrestRate = 0.05;
		
		System.out.println("Monthly intrest for saver 1 : "+saver1.calculateMonthlyInterest() +"\nTotal Balance of saver 1 : "+saver1.getSavingsBalance());
		System.out.println("Monthly intrest for saver 2 : "+saver2.calculateMonthlyInterest() +"\nTotal Balance of saver 2 : "+saver2.getSavingsBalance());
		
	}
}

class SavingsAccount{
	static double annualIntrestRate;
	private double savingsBalance;
	
	
	public double calculateMonthlyInterest() {
		double intrest = ((savingsBalance*annualIntrestRate)/12);
		savingsBalance+=intrest;
		return intrest;
	}
	
	public static void modifyInterestRate(double intrestRate) {
		annualIntrestRate = intrestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
}
