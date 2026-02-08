package javaLab.Lab9;

import java.util.Scanner;

public class ASWO extends Thread{
	Scanner sc = new Scanner(System.in);
	StudentOutPass sop;

	public ASWO(StudentOutPass sop) {
		this.sop = sop;
	}
	
	
	public void verify(int leave) throws MaxNumberOfDays {
		if(leave>5) {
			HOD hod = new HOD();
			throw new MaxNumberOfDays("More number of leaves "+leave);
			
		}
	}
	
	
	@Override
	public void run() {
		int i = 1;
		while(i<=DemoStudentOutPass.n){
			System.out.print("Enter roll_No : "); 
			String roll_No = sc.nextLine();
			System.out.print("Enter max leaves : ");
			int max_Leave_Days = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter reason : ");
			String reason = sc.nextLine();
			try {
				verify(max_Leave_Days);
				sop.push(roll_No, max_Leave_Days, reason);

			} catch (MaxNumberOfDays e) {
				e.printStackTrace();
			}
			finally {
				i++;
			}
			
		}
	}
	
	
}
