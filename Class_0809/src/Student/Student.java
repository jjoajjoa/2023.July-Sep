package Student;

public class Student {

	private String name;
	private String major;
	private int num;
	
	Student() {
		
	}
	
	Student(String name) {
		this.name = name;
		major = "";
		num = 0;
	}
	
	Student(String name, String major) {
		this.name = name;
		this.major = major;
		num = 0;
	}
	
}
