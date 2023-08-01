package class_0801;

public class Class01 {

	public static void main(String[] args) {
		Person p = new Person();
//		p.name = "park";
//		p.age = 20;		
//		System.out.println(p.name + " " + p.age);
		p.printPerson();
		
		Person p2 = new Person();
//		System.out.println(p2.name + " " + p2.age);
		p2.printPerson();
	
		Person p3 = new Person("Park", 22);
		System.out.println(p3.name + " " + p3.age);
		p3.printPerson();
	
		Person p4 = new Person("Kim");
//		System.out.println(p4.name + " " + p4.age);
		p4.printPerson();
		
		Person p5 = new Person(50);
//		System.out.println(p5.name + " " + p5.age);
		p5.printPerson();
	}

}


// 생성자(Constructor)
// 객체를 생성할 때, 객체를 초기화하는 특별한 메소드
// 객체가 생성될 때, 자동으로 호출
// 생성자 사용하려면 클래스와 "반드시" 같은 이름으로 사용해야함

// 기본생성자(Default Constructor)
// 매개변수(괄호안에있는거) 없이 호출되는 생성자
// 객체를 생성할 때, 바로 호출되는 친구 <- 따로 선언하지 않아도 됨

// 생성자의 선언
// 클래스명() {
// 	code
// }

// 생성자는 객체를 생성할 때만 실행됨
