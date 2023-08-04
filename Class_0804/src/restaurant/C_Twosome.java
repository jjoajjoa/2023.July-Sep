package restaurant;

public class C_Twosome extends Cafe{
	
	String[] menuT;
	int[] priceT;
	
	C_Twosome() {
		
	}
	
	C_Twosome(String nation, String name   ) { 
		
	}
	
	C_Twosome(String nation, String name, int point, String menu, int price) {
		super(nation, name, point);
		this.menuT = menuT;
		this.priceT = priceT;

	}
	
	C_Twosome(String nation, String name, int point, String[] menu, int[] price) {
		super(nation, name, point);
		this.menuT = menu;
		this.priceT = price;
	}
	
	void printTwoMe() {
		super.printStar();
		for(int i=0; i<menuT.length; i++) {
			System.out.println("메뉴 : " + menuT[i] + ", 가격 : " + priceT[i]);
		}
	} 

}
