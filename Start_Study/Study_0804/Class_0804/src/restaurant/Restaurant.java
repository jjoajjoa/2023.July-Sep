package restaurant;

public class Restaurant {
	
	String nation;
	
	Restaurant() {
		nation = "";
	}
	
	Restaurant(String nation) {
		this.nation = nation;
	}
	
	void printRes() {
		System.out.println("국가: " + nation); //국가 : 123
	}
	
	
	
	
	
}
