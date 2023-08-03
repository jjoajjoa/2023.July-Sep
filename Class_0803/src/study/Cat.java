package study;
//	String preferSnack	좋아하는 간식
public class Cat extends MyHome {
	
	
	String name = "김쪼랭";
	int age = 4;
	String species = "고양이";
	
	
	Cat(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	void intro() {
		super.intro();
	}
	
	void play() {
		System.out.println("긁긁놀이는 재밌어");
	}

	void eat(String preferSnack) {
		System.out.println("내가 젤 좋아하는 간식은 " + preferSnack + "야");
	}
	
}
