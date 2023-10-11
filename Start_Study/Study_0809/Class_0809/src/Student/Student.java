package Student;
import java.util.Scanner;
public class Student {
	Scanner scan = new Scanner(System.in);
	
	static final int physical = 123;
	static final int chemistry = 124;
	static final int biologic = 125;
	static final int earthSci = 126;
	
	private String major;
	private String name;
	private int num;
	
	Student () {
		
	}
	
	Student (String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	String getName() {
		return name;
	}
	
	int getNum() {
		return num;
	}
	
	void setNum (int num) {
		this.num = num;
	}
	
	
//	void stuNum() {
//		System.out.println(studentP1.getName()+ " " + student20.stNum20 + Student.physical + studentP1.getNum());
//		System.out.println(name + " " + student20.);
//	}
	
	
	void majorInfo() {
		major = scan.nextLine();
		if(major.equals("물리과") || major.equals("물리")) { 
			System.out.println(" ** 물리과 학생 명단입니당 **");
			System.out.println(name);
			
		} else if (major.equals("화학과") || major.equals("화학")) {
			
		} else if (major.equals("생명과") || major.equals("생명")) {
			
		} else if (major.equals("지구과학과") || major.equals("지구과학") || major.equals("지구")) {
			
		} else {
			System.out.print("똑바로 입력하세용  ");
			this.majorInfo();
		}
		
	}

}
