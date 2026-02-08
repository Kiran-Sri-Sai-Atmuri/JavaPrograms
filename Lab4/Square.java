package javaLab.Lab4;

public class Square extends Rectangle{
	private double side;

	public Square() {
		
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side,String color , boolean filled) {
		this.side = side;
		super.color = color;
		super.filled = filled;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public void setWidth(double side) {
		this.side = side;
	}
	
	@Override
	public void setLength(double side) {
		this.side = side;
	}
	
	

}
