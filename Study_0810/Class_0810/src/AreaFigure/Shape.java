package AreaFigure;
public class Shape {

	private String name;
	private double radius; //원
	private int segment1; //밑변 x축
	private int segment2; //높이 y축
	
	Shape() {
		
	}
	
	Shape(String name, double radius) { //원
		this.name = name;
		this.radius = radius;
	}
	
	Shape(String name, int segment1) { 
		this.name = name;
		this.segment1 = segment1;
	}
	
	Shape(String name, int segment1, int segment2) {
		this.name = name;
		this.segment1 = segment1;
		this.segment2 = segment2;
	}
	
	String getName() {
		return name;
	}
	
	double getRadius() {
		return radius;
	}
	
	int getSegment1() {
		return segment1;
	}
	
	int getSegment2() {
		return segment2;
	}
	
	void printArea() { //Shape shape = new Shape("동그라미", 5);
		System.out.println(name + "의 반지름: " + radius);
		double circleAreaS = (radius*radius) * Circle.PI;
		System.out.println(name + "의 넓이: " + circleAreaS);
	}
	
	@Override
	public String toString() {
		return name + " 입니당 ";
	}
	
	
}





