package AreaFigure;

public class Triangle extends Shape{

	Triangle (String name, int segment1) { 
		super(name, segment1);
	}
	
	Triangle (String name, int segment1, int segment2) { 
		super(name, segment1, segment2);
	}
	
	@Override
	void printArea() { 
		System.out.println(super.getName() + "의 밑변: " + super.getSegment1() + ", 높이: " + super.getSegment2());
		int triangleArea = (super.getSegment1() * super.getSegment2())/2;
		System.out.println(super.getName() + "의 넓이: " + triangleArea);
	}
	
}
