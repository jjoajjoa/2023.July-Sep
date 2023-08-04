package restaurant;

public class Cafe extends Restaurant{

	String name;
	int point = 0;
	int count = 0;
	
	Cafe() { 
		name = "";
	}
	
	
	Cafe(String nation, String name) {
		super(nation);
		this.name = name;
	}
	
	Cafe(String nation, String name, int point) {
		super(nation);
		this.name = name;
		this.point += point;
		count++;
	}
		
	void printCafe() { //완료
		System.out.println("국가: " + this.nation + ", 상호명: " + this.name); //국가 : 한국
	}
	
	void printStar() {
		if(count == 0) {
			System.out.println("국가: " + nation + ", 상호명: " + name + ", 별점: 0");
		}
		else {
			System.out.println("국가: " + nation + ", 상호명: " + name + ", 별점: " + point/count);
		}
	}
	
	void setPoint(int point) {
		this.point += point;
		count++;
	}
	
	
}
