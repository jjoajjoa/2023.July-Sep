package Food;

public class F_Korean extends Food{
	
//	String nation; <- 이건 Restaurant 클래스에 있음
//	String name;   <- 이건 Food 클래스에 있음
//	int seat;
	String[] menuK;
	int[] priceK;
	
	F_Korean() {
		setting();
	}
	
	F_Korean(int seat) {
		super(seat);//setSeat(seat); //20
	}
	
	F_Korean(String nation, String name, int point) {
		super(nation, name, point);		
		this.setting();
	}
	
	F_Korean(String nation, String name, int point, String menu, int price) {
		super(nation, name, point);
		setting();
		this.menuK[0] = menu;
		this.priceK[0] = price;
	}
	
	F_Korean(String nation, String name, int point, String[] menu, int[] price) {
		super(nation, name, point);
		this.menuK = menu;
		this.priceK = price;
	}
	
	void korSeat() {
		System.out.println("현재 남은 좌석 수: " + getSeat());
	}
	
	
	void korCome(Customer customer, F_Korean kSeat) { 
		if (customer.getMember() <= kSeat.getSeat()) {
			System.out.println(customer.getName() + "님 예약 가능");
			int X = kSeat.getSeat() - customer.getMember();
			kSeat.setSeat(X);
			System.out.println("남은 좌석 수: " + kSeat.getSeat());
		} else {
			System.out.println(customer.getName() + "님 예약 불가능");
		}
	}
	
	
	

	@Override
	void printFood() { 
		System.out.println("오늘의 메뉴는 " + "순찌" + " 입니당");
	}
	
	void printKoMePr() {
		super.printStar();
		for(int i=0; i<menuK.length; i++) {
			System.out.println("메뉴: " + menuK[i] + ", 가격: " + priceK[i]);
		}
	}
	
	void setting() {
		menuK = new String[3];
		priceK = new int[3];
		
		for(int i=0; i < menuK.length; i++) {
			menuK[i] = "SOLD OUT";
			priceK[i] = 0;
		}
	}

}
