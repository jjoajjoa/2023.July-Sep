package Class0807;

public class Class01 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.makeSound();
		cat.makeSound();
	}
	
}

class Animal {
	void makeSound() {
		System.out.println("동물 울음소리");
	}
}

class Cat extends Animal {
	@Override // 헷깔리지 말라고 이거 부모꺼 재정의 한거라고 알려줌
	void makeSound() {
		System.out.println("야옹");
	}
}


// 오버라이딩 (method overriding)
// 부모클래스의 메서드를 자식클래서에서 재정의 하는 것.
// 부모클래스의 동작을 자기 동작으로 바꿈
// 굳이 부모클래스를 수정하지않고, 자식클래스에서 메서드 기능을 변경할 수 있다.

// 주석 <- 컴퓨터가 읽지 못하는 메모
// @Override -> 컴퓨터가 읽을 수 있는 메모
// 오버라이딩 할 메서드는 
// 접근지정자(퍼블릭), 반환자료형, 이름, 매개변수 갯수, 자료형 이 
// 부모클래스와 일치해야함