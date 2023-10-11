package Food;
public class F_Japanese extends Food{
	int seat;
	String[] menuJ;
	int[] priceJ;
	
	F_Japanese() {
		setting();
	}
	
//	F_Jananese (int seat) {
//		this.seat = seat;
//	}
	
	F_Japanese(String nation, String name, int point) {
		super(nation, name, point);
		this.setting();
	}
	
	F_Japanese(String nation, String name, int point, String menu, int price) {
		super(nation, name, point);

		setting();
		this.menuJ[0] = menu;
		this.priceJ[0] = price;
	}
	
	F_Japanese(String nation, String name, int point, String[] menu, int[] price) {
		super(nation, name, point);
		this.menuJ = menu;
		this.priceJ = price;
	}
	
	
	void printJaMePr() {
		super.printStar();
		for(int i=0; i<menuJ.length; i++) {
			System.out.println("메뉴: " + menuJ[i] + ", 가격: " + priceJ[i]);
		}
	}
	
	void setting() {
		menuJ = new String[3];
		priceJ = new int[3];
		
		for(int i=0; i < menuJ.length; i++) {
			menuJ[i] = "SOLD OUT";
			priceJ[i] = 0;
		}
	}
	
}
