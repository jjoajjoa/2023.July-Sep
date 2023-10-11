package AreaFigure;

public class Rectangle extends Shape{

	Rectangle (String name, int segment1) { 
		super(name, segment1);
	}
	
	Rectangle (String name, int segment1, int segment2) { 
		super(name, segment1, segment2);
	}
	
	@Override
	void printArea() { 
		System.out.println(super.getName() + "의 두 변: " + super.getSegment1() + ", " + super.getSegment2());
		int rectangleArea = (super.getSegment1() * super.getSegment2());
		System.out.println(super.getName() + "의 넓이: " + rectangleArea);
	}
	
}
