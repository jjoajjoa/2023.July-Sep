package study;
// 부모클래스: 우리집
public class MyHome {

	
	String species; //종
	String name; //이름
	int age; //나이
	String preferPlay; //좋아하는 놀이
	String preferSnack; //좋아하는 간식

	MyHome() {
		String name = "엥";
		int age = 0;
	}
  
	
	MyHome(String species) {
		this.species = "메롱";
	}
	
	MyHome(String species, String name) {
		this.species = "메롱";
		this.name = "야호";	
	}
	
	
	void intro() { //자기소개
		System.out.println("안녕, 나는 " + name + ". " + age + "살 " + species + "야.");
	}
	
	void play() {
		System.out.println("내가 젤 좋아하는 놀이는 " + preferPlay + "이야.");
	}
	
	void eat() {
		System.out.println("내가 젤 좋아하는 간식은 " + preferSnack + "이야.");
	}

}
