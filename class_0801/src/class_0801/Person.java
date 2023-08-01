package class_0801;

public class Person {
	//인스턴스변수 2개
	String name; // = "park";
	int age; // = 20;
	
	Person(){ //기본생성자
//		System.out.println("Person객체 생성완");
		name = "Unknown";
		age = 0;
	}
	
	Person(String str, int num) {
		name = str.toUpperCase(); //함수사용가능
		age = num;
	} // 매개변수가 있는 생성자
	
	Person(String str) {
		name = str;
		age = 0;
	}
	
	Person(int num) {
		name = "Unknown";
		age = num;
	}
	
	Person(String str, String str2, int num1, int num2) {
		name = str;
		age = num1;
	}

	void printPerson() {
		System.out.println(name + " " + age);
	}
}
