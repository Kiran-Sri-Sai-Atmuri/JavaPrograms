package javaLab.Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AmazonStoreApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AmazonStore as = new AmazonStore();
		try {
			BufferedReader br = new BufferedReader(new FileReader("stock.txt"));
			String st = "";
			while((st = br.readLine())!=null) {
				String[] str = st.split(",");
				String model_Name = str[0];
				String serial_No = str[1];
				float price = Float.parseFloat(str[2]);
				as.add(model_Name,serial_No, price);
			}
			br.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("Enter 1 to add\n2 to update\n3 to remove\n4 to display\n5 to sort\n6 exit");
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1 :
				
				System.out.print("Enter model_Name : ");
				String model_Name = s.nextLine();
				
				System.out.print("Enter serial_No : ");
				String serial_NO = s.nextLine();
				
				System.out.print("Enter price : ");
				float price = s.nextFloat();
				
				as.add(model_Name,serial_NO,price);
				
				System.out.println("Added Successfully");
				
				break;
			case 2:
				System.out.print("Enter serial_No : ");
				String serial_No2 = s.nextLine();
				
				as.update(serial_No2);
				
				System.out.println("Updated Successfully");
				
				break;
			case 3 :
				
				System.out.print("Enter serial_No to remove : ");
				
				String serial_No3 = s.nextLine();
				
				System.out.println(serial_No3);
				
				as.remove(serial_No3);
				
				System.out.println("Removed Successfully");
				
				break;
			case 4:
				as.display();
				break;
			case 5:
				as.sort();
				break;
			case 6:
				as.write();
				System.exit(1);
			default : 
				System.out.println("Invalid Request");
				
			}
			

		}
	}
}
