 package javaLab.Lab8;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ShoppingCart {
	LinkedList<CartItem> list = new LinkedList<>();
	
	
		
		
	
	public void add(String productId, String name, float price, int quantity) {
		CartItem ci = new CartItem(productId,name,price,quantity);
		list.add(ci);
		

	}
	
	
	public void display() {
		
		for(CartItem item : list)
			System.out.println(item);
	}
	
	
	public void update(String prodId,int quantity) {
		
		for(CartItem item : list) {
			if(item.productId.equals(prodId)) {
				item.quantity = quantity;
			}
		}
		
		
	}
	
	 public void remove(String prodId) {
		 for(CartItem item : list) {
				if(item.productId.equals(prodId)) {
					list.remove(item);
				}
			}
	 }
	
	public void write() {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("item.txt"));
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
