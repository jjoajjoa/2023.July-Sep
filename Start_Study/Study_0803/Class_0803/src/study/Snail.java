package study;
//	String preferPlay	좋아하는 놀이
public class Snail extends MyHome {
	
	
	Snail(String name,int age, String species) {
		super(name,age, species);
	}
	
	Snail(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void intro() {
		super.intro();
	}
	
	void preferPlay(String preferPlay) {
		System.out.println("내가 젤 좋아하는 놀이는 " + preferPlay + "야");
	}
	
}
