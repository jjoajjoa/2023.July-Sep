package Food;

public class Food extends Restaurant{
	
//	String nation; <- 이건 Restaurant 클래스에 있음
	String name;
	int point = 0;
	int count = 0;
	
	Food() {

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
