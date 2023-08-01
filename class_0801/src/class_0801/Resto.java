package class_0801;
// 부모클래스
// 식당 : 나라, 상호명, 평점
public class Resto {

	String nation;
	String name;
	float rank;
	int point = 0;
	int count = 0;
	
	Resto() {
		nation = "";
		name = "";
		rank = 0;
	}
	
	Resto(String nation, String name, int point) {
		this.nation = nation;
		this.name = name;
		this.point += point;
		count++;
	}
	
	void printRes() {
		if(count == 0) {
			System.out.println("국가: " + nation + ", 상호명: "+ name + ", 평점: 0");
		} else {
			System.out.println("국가: " + nation + ", 상호명: "+ name + ", 평점: " + point/count);
		}
	}
	
	void setPoint(int point) {
		this.point += point;
		count++;
	}
	
	
	

	

}
