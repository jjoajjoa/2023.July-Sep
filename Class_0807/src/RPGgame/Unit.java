package RPGgame;
//유닛 - 공격력 레벨 체력 공격 정보
public class Unit {

	private String name; 
	private int level;
	private int health; //체력
	private int damage; //공격력
	private int experience;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getLevel() {
		return level;
	}
	
	void setLevel(int level) {
		this.level = level;
	}
	
	int getHealth() {
		return health;
	}
	
	void setHealth(int health) {
		this.health = health;
	}
	
	int getDamage() {
		return damage;
	}
	
	void setDamage(int damage) {
		this.damage = damage;
	}
	
	int getExperience() {
		return experience;
	}
	
	void setExperience(int experience) {
		this.experience = experience;
	}
	
	void info() {
		
	}
	
	void attack() {
		
	}
	
}
