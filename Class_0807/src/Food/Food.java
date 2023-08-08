package Food;

public class Food extends Restaurant{
	
//	String nation; <- 이건 Restaurant 클래스에 있음
	private String name;
	private int seat;
	private int point = 0;
	private int count = 0;
	
	Food() {

	}
	
	Food(int seat) {
		this.seat = seat;
	}
	
	Food(String nation, String name){
		super(nation);
		this.name =name;
	}
	
	Food(String nation, String name, int point) {
		this.nation = nation;
		this.name = name;
		this.point += point;
		count++;
	}

	String getName() {
		return name;
	}
	
	int getSeat() {
		return seat;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setSeat(int seat) {
		this.seat = seat;
	}
	
	void printFood() { //완료
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
