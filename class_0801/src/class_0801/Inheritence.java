package class_0801;
public class Inheritence {
	public static void main(String[] args) {

	
		Animal animal = new Animal();
		Dog dog = new Dog("부추", 8);
		Cat cat = new Cat("쪼랭", 4);
		
		dog.eat(); //밥먹는중
		dog.sleep(); //꿈꾸는중
		System.out.println(dog.name + " " + dog.age); //부추 8
		cat.eat(); //냠냠
		cat.sleep(); //고양이 꿈꾸는 중
		System.out.println(cat.name + " " + cat.age); //쪼랭 4
		
		animal.eat(); //밥먹는중
		animal.sleep(); //꿈꾸는중
		System.out.println(animal.name + " " + animal.age); //??? 0
		
		
	}
}








// 상속 (inheritence) -> 자식에게 물려주는 것

// 부모 클래스 (Parent C~) = 기반 클래스 (Bass C~)
// 부모클래스는 보통 자식클래스가 공통적으로 가지는 필드와 메서드를 정의할때 사용: 자식 여러개 가능
// 부모클래스명 {}
//

// 자식 클래스 (Child C~) = 파생 클래스 (derived C~)
// 자식클래스는 보통 부모클래스한테 상속받아 새로운 클래스 만듦 -> 속성, 메서드 등을 물려받기 가능
// 자식클래스명 extends 부모클래스명{}

//