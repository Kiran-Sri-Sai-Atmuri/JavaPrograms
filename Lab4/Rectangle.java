package javaLab.Lab4;

public class Rectangle extends Shape{
	
	private double width;
	private double length;
	
	public Rectangle() {
		
	}
	

	public Rectangle(double width, double length) {
		
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length,String color,boolean filled) {
		
		this.width = width;
		this.length = length;
		super.color = color;
		super.filled = filled;
		
	}
	
	


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public double getArea() {
		
		return (length*width);
	}

	@Override
	public double perimeter() {
		
		return ((2*length)+(2*width));
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + 
				", length=" + length + 
				", color=" + color + 
				", filled=" + filled + "]";
	}

}
