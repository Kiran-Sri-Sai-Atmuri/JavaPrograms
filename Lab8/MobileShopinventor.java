package javaLab.Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MobileShopinventor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MobileShop ms = new MobileShop();
		try {
			BufferedReader br = new BufferedReader(new FileReader("mobile.txt"));
			String st = "";
			while((st = br.readLine())!=null) {
				String[] str = st.split(",");
				String company_Name = str[0];
				String model_Name = str[1];
				float price = Float.parseFloat(str[2]);
				ms.add(company_Name, model_Name, price);
			}
			br.close();
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("Enter 1 to add\n2 to update\n3 to remove\n4 to display\n5 exit");
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1 :
				
				System.out.print("Enter company_Name : ");
				String company_Name = s.nextLine();
				
				System.out.print("Enter model_Name : ");
				String model_Name = s.nextLine();
				
				System.out.print("Enter price : ");
				float price = s.nextFloat();
				
				ms.add(company_Name, model_Name, price);
				
				System.out.println("Added Successfully");
				
				break;
			case 2:
				System.out.print("Enter model_Name : ");
				String model_Name2 = s.nextLine();
				
				ms.update(model_Name2);
				
				System.out.println("Updated Successfully");
				
				break;
			case 3 :
				
				
				System.out.print("Enter model_Name to remove : ");
				
				String model_Name3 = s.nextLine();
				
				System.out.println(model_Name3);
				
				ms.remove(model_Name3);
				
				System.out.println("Removed Successfully");
				
				break;
			case 4:
				ms.display();
				break;
			case 5:
				ms.write();
				System.exit(1);
			default : 
				System.out.println("Invalid Request");
				
			}
			s.close();

	}

}
}
