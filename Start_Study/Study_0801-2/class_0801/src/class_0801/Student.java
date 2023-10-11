package class_0801;

public class Student {
	
	String name;
	int age;
	String phoneNum;
	int num;
	
	Student() {
		name = "unknown";
		age = 0;
		phoneNum = "1234";
		num = 0;
	}
	
//	Student(String name, int age, int phoneNum, int num) {
//		this.name = name;
//		this.age = age;
//		this.phoneNum = phoneNum;
//		this.num = num;
//	}
//	
	
	
	
	
	
	
	Student(String str1) {
		name = str1;
		age = 0;
		phoneNum = "1234";
		num = 0;
		
		if(str1.charAt(0) < 58) {
			phoneNum = str1;
			name = "unknown";
		} else {
			name = str1;
			phoneNum = "unknown";
		}
	}
	
//	Student(int name) {
//		name = name;
//		age = 0;
//		phoneNum = "4567";
//		num = 0;
//	}
	
	
	
	
	
	
	
	
	
	
		
	void printStudent() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 연락처: " + phoneNum + ", 학번: " + num);
	}
	
}
