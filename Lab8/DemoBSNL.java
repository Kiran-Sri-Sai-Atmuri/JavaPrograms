package javaLab.Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoBSNL {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SubscriberList sl = new SubscriberList();
		try {
			BufferedReader br = new BufferedReader(new FileReader("BSNLData.txt"));
			String st = "";
			while((st = br.readLine())!=null) {
				String[] str = st.split(",");
				String subscriber_Id = str[0];
				String subscriber_Name = str[1];
				int balance = Integer.parseInt(str[2]);
				sl.add(subscriber_Id,subscriber_Name, balance);
			}
			br.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println(" --- Enter --- \n1 to add\n2 to search\n3 to remove\n4 to sort and store\n5 to exit : ");
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1 :
				
				System.out.print("Enter subscriber_Id : ");
				String subscriber_Id = s.nextLine();
				
				System.out.print("Enter subscriber_Name : ");
				String subscriber_Name = s.nextLine();
				
				System.out.print("Enter price : ");
				int balance = s.nextInt();
				
				sl.add(subscriber_Id,subscriber_Name,balance);
				
				System.out.println("Added Successfully");
				
				break;
			case 2:
				System.out.print("Enter subscriber_Id : ");
				String subscriber_Id2 = s.nextLine();
				
				sl.serach(subscriber_Id2);
				
				break;
			case 3 :
				
				System.out.print("Enter subscriber_Id to remove : ");
				
				String subscriber_Id3 = s.nextLine();
				
				sl.delete(subscriber_Id3);
				
				System.out.println("Removed Successfully");
				
				break;
			case 4:
				sl.sort();
				break;
			case 5:
				System.exit(1);
			default : 
				System.out.println("Invalid Request");
				
			}
			

		}
		
	}
}
