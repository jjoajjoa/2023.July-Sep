package class_0801;
// 자식클래스 1
// 한식집 : 메뉴 가격
public class Korean extends Resto {
	
	String[] menu = new String[3]; // 메뉴 3개
	int[] price = new int[3]; // 가격
	
	Korean() {
		setting();
	}
	
	Korean(String nation, String name, int point) { 
		super(nation, name, point);
		this.setting();
	}
	
	Korean(String nation,  String name, int point, String menu, int price) {
		super(nation, name, point);
		setting();
		this.menu[0] = menu;
		this.price[0] = price;
	} 
	
	Korean(String nation,  String name, int point, String[] menu, int[] price ) {
		super(nation, name, point);
		this.menu = menu;
		this.price = price;
	}
	
	void setting() {
		for (int i=0; i<menu.length; i++) {
			menu[i] ="솔드아웃";
			price[i] = 0;
		}
	}
	
	void printRes() {
		super.printRes();
		for(int i=0; i<menu.length; i++) {
			System.out.println("메뉴: " + menu[i] +", 가격: " + price[i]);
		}
	}
	
	
	
}
