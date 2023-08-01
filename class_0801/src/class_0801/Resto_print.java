package class_0801;

public class Resto_print {

	public static void main(String[] args) {
		
		Resto res = new Resto();
		res.printRes();
		
		Korean korean = new Korean();
		korean.printRes();
		
		Mexican mexi = new Mexican();
		mexi.printRes();
		
		Korean kor1 = new Korean("한국", "백반집", 5, "순찌", 8000);
		kor1.printRes();
		
		String[] menu = {"타코1", "타코2", "타코3"};
		int[] price = {1000, 2000, 3000};
		Mexican mexi1 = new Mexican("멕시코", "타코집", 3, menu, price);
		mexi1.printRes();
		
		
		

	}

}


