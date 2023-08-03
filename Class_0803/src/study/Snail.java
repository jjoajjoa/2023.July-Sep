package study;
//	String preferPlay	좋아하는 놀이
public class Snail extends MyHome {
	
	
	Snail(String species) {
		super(species);
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
