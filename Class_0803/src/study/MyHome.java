package study;
// 부모클래스: 우리집
public class MyHome {

	
	String name; //이름
	int age; //나이
	String species; //종
	
	MyHome() {
		String name = "엥";
		int age = 0;
	}
  
	
	MyHome(String species) {
		this.species = "메롱";
	}
	
	MyHome(String species, String name) {
		this.species = "히히";
		this.name = "야호";	
	}
	
	
	void intro() { //자기소개
		System.out.println("안녕, 나는 " + name + ". " + age + "살 " + species + "야.");
	}
	
	

}
