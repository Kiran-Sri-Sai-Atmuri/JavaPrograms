package javaLab.Lab8;


public class CartItem{

	String productId;
	String name;
	float price;
	int quantity = 0;
	public CartItem(String productId, String name, float price, int quantity) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return productId + 
				" " + name + " " + price + 
				" " + quantity;
	}
	
	
	
	

}
