package AreaFigure;

public class Circle extends Shape{

	static final double PI = 3.14;
	
	
	Circle (String name, double radius) { //원
		super(name, radius);
	}
	
	@Override
	void printArea() { //Shape circle = new Circle("원", 10);
		System.out.println(super.getName() + "의 반지름: " + super.getRadius());
		double circleArea = (super.getRadius() * super.getRadius()) * PI;
		System.out.println(super.getName() + "의 넓이: " + circleArea);
	}
	
	@Override
	public String toString() {
		return super.toString() + "넓이는 " + ((super.getRadius() * super.getRadius()) * PI) + " 입니당";
	}
	
	

}
