package javaLab.Lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class MobileShop {

   LinkedList<Mobile> list = new LinkedList<>();
	
	
		
		
	
   public void add(String company_Name, String model_Name, float price) {
	   Mobile m = new Mobile(company_Name,model_Name,price);
	   list.add(m);
   }
	
	
	public void display() {
		
		for(Mobile item : list)
			System.out.println(item);
	}
	
	
	public void update(String model_Name) {
		
		for(Mobile item : list) {
			if(item.model_Name.equals(model_Name)){
				
			}
		}
	}
	
	 public void remove(String model_Name) {
		 for(Mobile item : list) 
				if(item.model_Name.equals(model_Name))
					list.remove(item);
	 }
	
	public void write() {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("mobile.txt"));
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
}
