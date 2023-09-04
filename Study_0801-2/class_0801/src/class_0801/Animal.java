package class_0801;
// 부모클래스
public class Animal {	
	String name;
	int age;
	
	Animal() {
		name = "???";
		age = 0;
	}
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("밥먹는중");
	}
	
	void sleep() {
		System.out.println("꿈꾸는중");
	}
	
}

// 자식클래스 name, age, eat(), sleep() 전달 가능