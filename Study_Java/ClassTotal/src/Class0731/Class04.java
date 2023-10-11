package Class0731;

public class Class04 {
	public static void main(String[] args) {
		Person lee = new Person("Lee", 31);
		
		lee.sayHello();
		System.out.println(lee.name);
		System.out.println(lee.age);
		
		Person kim = new Person("Kim", 20);
		kim.sayHello();
		System.out.println(kim.name);
		System.out.println(kim.age);
		
		Dog dog1 = new Dog();
		dog1.age = 5;
		dog1.name = "푸들";
		dog1.sayHello();
		
		Dog dog2 = new Dog();
		dog2.age = 2;
		dog2.name = "치와와";
		dog2.sayHello();
		
		dog1.ageCal();
		dog2.ageCal();
		
		System.out.println(dog1.compareToAge(lee.age));//lee보다 나이가 많음.
		System.out.println(dog2.compareToAge(lee.age));//lee보다 나이가 적음.
		printA(dog1.compareToAge(lee.age), dog1.name, lee.name);
		printA(dog2.compareToAge(lee.age), dog2.name, lee.name);
		
		dog1.printB(lee);
		dog2.printB(lee);
	}
	
	public static void printA(boolean b, String dog, String person) {
		if(b) {
			System.out.println(dog + "의 나이가 " + person + "의 나이보다 더 많습니다.");
		}
		else {
			System.out.println(dog + "의 나이가 " + person + "의 나이보다 더 적습니다.");
		}
	}
}

//객체와 클래스 <- 객체 개념
//자바 <객체지향언어>

//클래스 (설계도)
//객체 (설계도를 통해 만들어진 것)

//[접근제어자] class 클래스명 {
//인스턴스 변수
//자료형 변수명1;
//자료형 변수명2;...

//생성자
//클래스명(매개변수1, 매개변수2...)

//메소드
//자료형 함수명(매개변수1, 매개변수2...) {
//	코드
//	반환값
//}

//자동차 클래스, 인스턴스 변수, 메소드




