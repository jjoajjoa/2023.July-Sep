package study;

public class Class051 {

	public static void main(String[] args) {
		
		MyHome myhome = new MyHome();
		
		Cat cat = new Cat("고양이", 4, "김쪼랭");
		
		Dog dog = new Dog("김부추");
		
		Snail snail = new Snail("달팽이");
		
		
		cat.intro();
		cat.eat("츄르");

		System.out.println("----------------");
		
		dog.intro();
		dog.yesterDay("목욕");
		
		System.out.println("----------------");
				
		snail.intro();
		snail.preferPlay("기어다니기");
		
		
	}

}
