package class_0801;
//자식클래스 2
public class Cat extends Animal {
	
	String name;
	int age;
	
	
	
	Cat(String name, int age) { //생성자		
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("냠냠");
	}
	
	void sleep() {
		System.out.println("고양이 꿈꾸는 중");
	}
	
}
