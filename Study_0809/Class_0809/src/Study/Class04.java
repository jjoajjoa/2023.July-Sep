package Study;

public class Class04 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.speak();
	}
}

class Animal {
	public void speak() {
		System.out.println("동물 울음소리");
	}
}

class Dog extends Animal {
	
}




//다형성 Polymorphism
//1. 메서드 오버라이딩, 메서드 오버로딩
//2. 참조변수 - 객체 캐스팅

//1. 오버로딩 Overloading
// ㄴ 메서드를 선언할 때 똑같은 이름의 메서드로
// ㄴ ex) 생성자
// 메서드 오버라이딩: 자식클래스에서 동일한 이름과 매갭변수를 가진 메서드를 정의하여 부모클래스의 메서드를 대처하는 것
// 메서드 오버로딩: 같은 이름의 메서드를 매개변수의 개수 타입 순서등의 차이를 이용하여 메서드 자체를 여러개 정의하는 것

//2. 참조변수 
// 캐스팅 (int) Math.random
//객체를 변환하는 것
//객체 캐스팅 (Character) monster

// 다형성에서 (연관성이 있는)부모-자식 관계에서 캐스팅을 사용할 수 있당
// 이때 참조변수가 사용할 수 있는 멤버의 갯수가 실제 인스턴스의 멤버의 변수보다 작아야 함
//  ㄴ 부모 <= 자식

//class Parent{}
//class Child extends Parent{}
//class Person{}
//
// Parent p1 = new Pa
// Ch c1 = new Ch
// Pa p2 

