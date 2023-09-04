package Student;
import java.util.Scanner;
public class MainStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student20 student20 = new Student20();
		Student21 student21 = new Student21();
		Student22 student22 = new Student22();
		Student23 student23 = new Student23();		
//		System.out.println(student20.stNum20);
//		System.out.println(student21.stNum21);
//		System.out.println(student22.stNum22);
//		System.out.println(student23.stNum23);
//		
//		System.out.println(Student.physical);
//		System.out.println(Student.chemistry);
//		System.out.println(Student.biologic);		
//		System.out.println(Student.earthSci);
//
//		System.out.println(""+student20.stNum20+Student.physical);		
//		System.out.println(""+student21.stNum21+Student.biologic);
		
		
		Student student = new Student();
		
		//물리과 20학번 1번 김일일 
		Student studentP1 = new Student("김물일", 1);
		Student studentP2 = new Student("김물이", 2);
		
		System.out.println(studentP1.getName()+ " " + student20.stNum20 + Student.physical + studentP1.getNum());
		
		//지구과학과 23학년 3번 김삼삼
		Student student2 = new Student("김삼삼", 3);
		System.out.println(student2.getName()+ " " + student23.stNum23 + Student.earthSci + student2.getNum());
		
		System.out.println(" ** 명단이 궁금한 과를 적어주세요 **");
		System.out.println(" ** 물리과, 화학과, 생명과, 지구과학과 **");
		student.majorInfo();
		
		
		
		
		
	}

}
