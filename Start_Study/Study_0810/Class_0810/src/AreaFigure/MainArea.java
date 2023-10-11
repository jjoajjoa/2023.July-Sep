package AreaFigure;
//import java.util.Scanner;
public class MainArea {

	public static void main(String[] args) {
		
		
		Shape shape = new Shape("동그라미", 5);
		
		Shape circle = new Circle("원", 10);
		
		Shape tri1 = new Triangle("정세모", 3);
		Shape tri2 = new Triangle("세모", 5, 7);
		
		Shape rac1 = new Rectangle("정네모", 3, 3);
		Shape rac2 = new Rectangle("네모", 5, 7);
		
		shape.printArea();
		circle.printArea();
		tri2.printArea();
		rac1.printArea();
		rac2.printArea();
		
		System.out.println(circle.toString());
		System.out.println(tri2.toString());

		
		
		
		
		
		

	}
	
}



