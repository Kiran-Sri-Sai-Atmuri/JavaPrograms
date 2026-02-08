package javaLab.Lab8;

public class Laptop {
		String model_Name;
		String serial_No;
		float price;
		
		public Laptop(String model_Name, String serial_No, float price) {
			this.model_Name = model_Name;
			this.serial_No = serial_No;
			this.price = price;
		}

		@Override
		public String toString() {
			return model_Name + "," + serial_No + "," + price;
		}
		
		
		
}
