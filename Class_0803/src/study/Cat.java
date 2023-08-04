package study;
//	String preferSnack	좋아하는 간식
public class Cat extends MyHome {
	
	Cat(String name,int age, String species) {
		super(name,age, species);
	}
	
	void intro() {
		super.intro();
		System.out.println("야옹야옹");
	}
	
	void eat(String preferSnack) {
		System.out.println("내가 젤 좋아하는 간식은 " + preferSnack + "야");
	}
	
}
