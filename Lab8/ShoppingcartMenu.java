package javaLab.Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShoppingcartMenu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ShoppingCart sc = new ShoppingCart();
		try {
			BufferedReader br = new BufferedReader(new FileReader("item.txt"));
			String st = "";
			while((st = br.readLine())!=null) {
				String[] str = st.split(" ");
				String prodId = str[0];
				String name = str[1];
				float price = Float.parseFloat(str[2]);
				int quantity = Integer.parseInt(str[3]);
				sc.add(prodId, name, price, quantity);
				
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
				
				System.out.print("Enter prodId : ");
				String prodId = s.nextLine();
				System.out.print("Enter name : ");
				String name = s.nextLine();
				System.out.print("Enter price : ");
				float price = s.nextFloat();
				s.nextLine();
				System.out.print("Enter quantity : ");
				int quantity = s.nextInt();
				s.nextLine();
				System.out.println(prodId);
				sc.add(prodId, name, price, quantity);
				System.out.println("Added Successfully");
				break;
			case 2:
				System.out.print("Enter prodId : ");
				String prodId2 = s.nextLine();
				
				System.out.print("Enter quantity : ");
				int quantity2 = s.nextInt();
				s.nextLine();
				sc.update(prodId2, quantity2);
				System.out.println("Updated Successfully");
				break;
			case 3 :
				System.out.print("Enter prodId to remove : ");
				String prodId3 = s.nextLine();
				
				sc.remove(prodId3);
				System.out.println("Removed Successfully");
				break;
			case 4:
				sc.display();
				break;
			case 5:
				sc.write();
				System.exit(1);
			default : 
				System.out.println("Invalid Request");
				
			}
			
			
				
		
		}
	}
}
