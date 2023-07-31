package method;

public class Dog {

	String name = "백구";
	int age = 3;
	
	void sayHello() {
		System.out.println("멍멍 : " + name + ", 왈왈 : " + age);
	}
	
	//사람나이로 환산하기
	// 24 + (강아지나이-2) *4 = 사람나이
	void ageCal() {
		System.out.println("사람나이로 환산하면 " + (24 + (age-2)*4) + "세 입니다.");		
	}
	
	// 사람나이로 환산하기2: 이런 방법도 있움
	boolean calDogPer(int personAge) {
		return 24 + (age-2)*4 > personAge;
	}
	
	// 간단하게 해보기
	void printB(Person person) {
		if ( (age-2)*4 > person.age) {
			System.out.println(name + "의 나이가 " + person.name + "의 나이보다 많다");
		} else {
			System.out.println(name + "의 나이가 " + person.name + "의 나이보다 적다");			
		}
	}
}

