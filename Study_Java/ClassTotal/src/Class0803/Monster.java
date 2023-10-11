package Class0803;

public class Monster {
	String name; //인스턴스 변수
	int health; //인스턴스 변수
	
	Monster(String name, int health) { //생성자
		this.name = name;
		this.health = health;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name + ", 체력 : " + health);
	}
	
	void attack() {
		System.out.println(name + "이(가) 공격을 시전합니다!");
	}
}
