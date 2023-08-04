package restaurant;

public class Cafe extends Restaurant{

	String name;
	
	Cafe() {

	}
	
	
	Cafe(String nation, String name) {
		super(nation);
		this.name = name;
	}
	
//	Cafe(String nation, String name) {
//		this.nation = nation;
//		this.name = name;
//	}
	
	void printCafe() { //완료
		System.out.println("국가: " + this.nation + ", 상호명: " + this.name); //국가 : 한국
	}
	
	
	
	
}
