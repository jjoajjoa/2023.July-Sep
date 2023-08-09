package RPGgame;
//몬스터 - 타입
public class Moster extends Unit {

//	private String name; 
//	private String job;//
//	private int level;
//	private int damage;
//	private int experience;	
	
	Moster (String name, int health, int damage) {
		super(name,health,damage);
	}
		
	void InfoMon() {
		System.out.println(" ** 야생의 " + super.getName() + "가 나타났다! **");
		System.out.println(super.getName() + " 체력: " + super.getHealth() + " / 공격력: " + super.getDamage());
//		System.out.println("[system] 공격하실?");
	}
	
	
	
	
}
