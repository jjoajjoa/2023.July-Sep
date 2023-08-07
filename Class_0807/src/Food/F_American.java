package Food;
public class F_American extends Food{
	
	String[] menuA;
	int[] priceA;
	
	F_American() {
		setting();
	}
	
	F_American(String nation, String name, int point) {
		super(nation, name, point);
		this.setting();
	}
	
	F_American(String nation, String name, int point, String menu, int price) {
		super(nation, name, point);

		setting();
		this.menuA[0] = menu;
		this.priceA[0] = price;
	}
	
	F_American(String nation, String name, int point, String[] menu, int[] price) {
		super(nation, name, point);
		this.menuA = menu;
		this.priceA = price;
	}
	
	void printAmMePr() {
		super.printStar();
		for(int i=0; i<menuA.length; i++) {
			System.out.println("메뉴 : " + menuA[i] + ", 가격 : " + priceA[i]);
		}
	}
	
	void setting() {
		menuA = new String[3];
		priceA = new int[3];
		
		for(int i=0; i < menuA.length; i++) {
			menuA[i] = "SOLD OUT";
			priceA[i] = 0;
		}
	}
	
	void printRes() {
		super.printRes();
		for(int i=0; i<menuA.length; i++) {
			System.out.println("메뉴 : " + menuA[i] + ", 가격 : " + priceA[i]);
		}
	}
}

//1. 요식업 - (식당, 카페) - (나라별 가게, )
//2. 주사위 게임하는 사람들 - 객체가 생성되면 랜덤한 주사위 값(1~6)을 가지고 있다. 다른 객체와 주사위 값을 가지고
//승부한다. 누가 이겼는지 판단을 하고, 게임을 할 때마다 주사위 값이 바뀌어야 한다.

//3. 카드게임 -> 객체화
//컴퓨터, 사람를 객체화한다. 컴퓨터VS컴퓨터, 컴퓨터vs사람, 사람vs사람





