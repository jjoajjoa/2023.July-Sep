package Food;

public class Customer {

	private String name;
	private int member;
	
	Customer() {
		name = "";
		member = 0;
	}
	
	Customer(String name, int member) {
		this.name = name;
		this.member = member;
	}
	
	void customerMem() {
		System.out.println(name + "님의 예약손님: " + member + "명");
	}
	
	
	String getName() {
		return name;
	}
	
	int getMember() {
		return member;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setMember(int member) {
		this.member = member;
	}

	
	
}
