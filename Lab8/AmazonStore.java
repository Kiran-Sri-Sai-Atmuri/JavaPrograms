package javaLab.Lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class AmazonStore {
	
	 LinkedList<Laptop> list = new LinkedList<>();
		
		
		
		
		
	   public void add(String model_Name, String serial_No, float price) {
		   Laptop lap = new Laptop(model_Name,serial_No,price);
		   list.add(lap);
	   }
		
		
		public void display() {
			
			for(Laptop lap : list)
				System.out.println(lap);
		}
		
		
		public void update(String serial_No) {
			Scanner sc = new Scanner(System.in);
			int i=0;
			for(i=0 ; i<list.size() ; i++)
				if(list.get(i).serial_No.equalsIgnoreCase(serial_No))
					break;
			System.out.print("\nEnter 1 to update model_Name 2 to update price : ");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				
				System.out.print("Enter model_Name : ");
				String newModel = sc.nextLine();
				Laptop l = new Laptop(newModel, serial_No, list.get(i).price);
				list.set(i, l);
				
			}
			
			else if(choice == 2) {
				
				System.out.print("Enter price : ");
				float price = sc.nextFloat();
				Laptop l = new Laptop(list.get(i).model_Name, serial_No, price);
				list.set(i, l);
				
			}
		}
		
		 public void remove(String serial_No) {
			 for(Laptop item : list) 
					if(item.serial_No.equals(serial_No))
						list.remove(item);
		 }
		
		public void write() {
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("stock.txt"));
				String str = "";
				for(int i=0;i<=list.size()-1;i++) {
					str+=list.get(i)+"\n";
				}
				bw.write(str);
				bw.close();
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		public void sort() {
			LinkedList<Laptop> list2 = new LinkedList<>(list);
			
			for(int i=0;i<list2.size()-1;i++) {
				for(int j=i+1;j<list2.size();j++) {
					if(list2.get(i).price > list2.get(j).price) {
						
						Laptop temp = list2.get(i);
						list2.set(i, list.get(j));
						list2.set(j, temp);
					}
				}
			}
			
			for(Laptop lap : list2)
				System.out.println(lap);
			
		}

}
