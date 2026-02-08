package javaLab.Lab4;

public class Circle extends Shape{

	
	double radius ;
	
	
	public Circle() {
		
	}
	
	

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius,String color , boolean filled) {
		this.radius = radius;
		super.color = color;
		super.filled = filled;
	}



	@Override
	public double getArea() {
		
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		
		return 3.14*2*radius;
	}



	@Override
	public String toString() {
		return "Circle [radius=" + radius + 
				", color=" + color + 
				", filled=" + filled + "]";
	}

	

}
