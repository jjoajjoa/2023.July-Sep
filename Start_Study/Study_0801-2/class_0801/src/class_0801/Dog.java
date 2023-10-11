package class_0801;
// 자식클래스 1
public class Dog extends Animal {
	
	Dog(String name, int age) { //생성자
		super(name, age); //인스턴스변수 안만들어도 활용가능
	}
		
	void eat() {
		super.eat(); //부모eat 가져오기
	}
	
	void sleep() {
		super.sleep(); //부모sleep 가져오기
	}
	
}
