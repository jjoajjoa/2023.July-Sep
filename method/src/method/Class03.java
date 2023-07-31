package method;

public class Class03 {

	public static void main(String[] args) {
		
		Person lee = new Person("Lee", 21);
		
		lee.sayHello();
		System.out.println(lee.name);
		System.out.println(lee.age);
		
		Person kim = new Person("kim", 22);
		kim.sayHello();
		System.out.println(kim.name);
		System.out.println(kim.age);
		
		Dog dog1 = new Dog();
		dog1.age = 5;
		dog1.name = "푸들";
		dog1.sayHello();
		
		Dog dog2 = new Dog();
		dog2.age = 2;
		dog2.name = "비숑";
		dog2.sayHello();
		
		Car car1 = new Car();
		car1.sayHello();
		
		
	}

}








// 객체와 클래스
// java <객체지향 프로그래밍 언어>

//클래스 Class: 설계도
//객체 Object: 설계도를 통해 만들어진 것

//[접근제어자:퍼블릭] class 클래스명 {
// 	code: 인스턴스 변수 -> 자료형 변수명n;
// }

//생성자
//클래스명(매개변수1, 매개변수2, ...)

//메소드
//자료형 함수명(매개변수1, 매개변수2, ...) {
// code
// 반환값
// }
