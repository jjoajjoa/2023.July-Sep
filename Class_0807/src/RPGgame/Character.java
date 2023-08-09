package RPGgame;
//캐릭터 - 직업선택 공격 정보 경험치 레벨업
public class Character extends Unit {

//	private String name; 
//	private String job;//
//	private int level;
//	private int damage;
//	private int experience;	
	
	Character() {
		
	}
	
	Character (String name, int health, int damage) {
		super(name,health,damage);
	}
	
	Character (String name, int health, int damage, int level) {
		super(name,health,damage);
		this.getLevel();
	}
	
	

	void infoChar() {
		System.out.println(super.getName() + " 체력: " + super.getHealth() + " / 공격력: " + super.getDamage() + " / 레벨: " + super.getLevel() );
		System.out.println();
	}
	
	
	
	
}
