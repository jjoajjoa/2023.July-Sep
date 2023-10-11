package method;

public class Person { // 클래스
	
	String name = "kim";
	int age = 20; // 인스턴스변수
	int [] arr = new int[5];
	
	Person(String name, int age) { // 생성자
		this.name = name;
		this.age = age;
	}
	
	void sayHello() { // 메소드
		System.out.println("안녕 나는 " + name + "이고, 나이는 " + age + "이야.");
	} 
	
}
