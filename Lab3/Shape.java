package javaLab.Lab3;

public abstract class Shape {

	abstract public int numberOfSides();

}

class Trapizoid extends Shape{

	@Override
	public int numberOfSides() {
		return 4;
	}
}


class Triangle extends Shape{

	@Override
	public int numberOfSides() {
		return 3;
	}
}


class Hexagon extends Shape{

	@Override
	public int numberOfSides() {
		return 6;
	}
}
